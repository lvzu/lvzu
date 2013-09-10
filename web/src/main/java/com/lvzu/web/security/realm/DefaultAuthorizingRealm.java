package com.lvzu.web.security.realm;


import com.lvzu.model.User;
import com.lvzu.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.util.Assert;

public class DefaultAuthorizingRealm extends AuthorizingRealm implements BeanFactoryAware {

    private static final String REALM_NAME = "default";

    private BeanFactory beanFactory;
    //
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //
        UserService userService = beanFactory.getBean(UserService.class);
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        Assert.hasText(usernamePasswordToken.getUsername(), "Username can not be null!");
        User user = userService.findByUsername(usernamePasswordToken.getUsername());
        //
        Assert.notNull(user, String.format("User not found for username %s", usernamePasswordToken.getUsername()));
        //
        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), REALM_NAME);
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

}
