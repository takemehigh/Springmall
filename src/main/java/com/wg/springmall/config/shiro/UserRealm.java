package com.wg.springmall.config.shiro;

import com.wg.springmall.entity.SysUser;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.tomcat.util.http.parser.Authorization;

import java.net.PasswordAuthentication;

public class UserRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("授权");
        return new SimpleAuthorizationInfo();
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken up=(UsernamePasswordToken)authenticationToken;
        String username=up.getUsername();
        SysUser user=new SysUser();
        if("wg".equals(username)){
            user.setUserName(username);
            user.setPassword(new String(up.getPassword()));
        }
        else{
            throw new UnknownAccountException("用户错误");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, up.getPassword(), getName());
        return info;
    }
}
