package com.lvzu.web.security.listener;

import com.lvzu.model.User;
import com.lvzu.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.web.subject.WebSubject;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class DefaultAuthenticationListener implements AuthenticationListener, BeanFactoryAware {

    private static final Log log = LogFactory.getLog(DefaultAuthenticationListener.class);

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    protected UserService getUserService() {
        return beanFactory.getBean(UserService.class);
    }

    @Override
    public void onSuccess(AuthenticationToken token, AuthenticationInfo info) {
        //
        log.info("User " + token.getPrincipal() + " login success!");
        WebSubject webSubject = (WebSubject) SecurityUtils.getSubject();
        Session session = webSubject.getSession();
        //
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        User user = getUserService().findByUsername(usernamePasswordToken.getUsername());
        session.setAttribute("user", user);
        
    }

    @Override
    public void onFailure(AuthenticationToken token, AuthenticationException ae) {
        WebSubject webSubject = (WebSubject) SecurityUtils.getSubject();
        webSubject.getSession().setAttribute(AuthenticationException.class.getName(), ae);
    }

    @Override
    public void onLogout(PrincipalCollection principals) {
        log.info("User " + principals.getPrimaryPrincipal() + " logout success!");
    }
}
