package com.hykj.mono.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

@Component
public class MyRealm extends AuthorizingRealm {
    //1.授权   查询登录用户的角色或者权限
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    //2.认证   生成凭证  登陆成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        if (token.getUsername() != null) {
            //登录成功
            AuthenticationInfo info = new SimpleAuthenticationInfo(token.getPrincipal(), token.getPassword(), getName());
            return info;
        }
        return null;
    }
}
