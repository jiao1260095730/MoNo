package com.hykj.mono.config;

import com.hykj.mono.shiro.MyRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    //创建权限管理对象
    @Bean
    public DefaultWebSecurityManager createSM(MyRealm realm) {
        return new DefaultWebSecurityManager(realm);
    }

    //创建shiro过滤器对象
    @Bean
    public ShiroFilterFactoryBean createSF(DefaultWebSecurityManager webSecurityManager) {
        //1.创建shiro过滤器工厂对象
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        //2.设置权限管理器对象
        factoryBean.setSecurityManager(webSecurityManager);

        //3.设置常用的3个URL页面
        //设置登录页面
        factoryBean.setLoginUrl("login.html");

        //设置登录成功后的跳转的页面
        factoryBean.setSuccessUrl("index.html");

        //设置未授权页面
        factoryBean.setUnauthorizedUrl("error.html");

        //4.设置拦截规则。 anon：匿名访问 放行 谁都可以使用 authc:认证访问 必须登录才可以使用
        Map<String, String> map = new HashMap<>();
        map.put("/login.html","anon");
        map.put("/api/user/login.do","anon");
        //静态资源放行
        map.put("/static/media/**","anon");
        map.put("/swagger-ui.html", "anon");
        map.put("/webjars/**", "anon");
        map.put("/v2/**", "anon");
        map.put("/swagger-resources/**", "anon");
        map.put("/swagger-resources", "anon");
        //swagger接口权限 开放
        map.put("/swagger-ui.html", "anon");
        map.put("/webjars/**", "anon");
        map.put("/v2/**", "anon");
        map.put("/swagger-resources/**", "anon");
        map.put("/swagger-resources", "anon");
        //全部拦截
        map.put("/*","authc");
        factoryBean.setFilterChainDefinitionMap(map);
        return factoryBean;
    }
}
