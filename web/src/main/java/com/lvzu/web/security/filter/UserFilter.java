package com.lvzu.web.security.filter;


import com.lvzu.model.User;
import com.lvzu.service.UserService;
import org.apache.shiro.web.subject.WebSubject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class UserFilter extends org.apache.shiro.web.filter.authc.UserFilter
    implements BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        //
        WebSubject webSubject = (WebSubject) getSubject(request, response);
        //
        boolean isAllowed = super.isAccessAllowed(request, response, mappedValue);
        Object sessionUser = webSubject.getSession().getAttribute(User.class.getName());
        if(isAllowed && sessionUser==null) {
            //
            UserService userService = beanFactory.getBean(UserService.class);
            String username = webSubject.getPrincipal().toString();
            User user = userService.findByUsername(username);
            //
            webSubject.getSession().setAttribute("user", user);
            webSubject.getSession().setAttribute(User.class.getName(), user);
        }
        //
        return isAllowed;
    }
}
