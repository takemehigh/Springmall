package com.wg.springmall.config.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Bean
    public UserRealm userRealm(){
        UserRealm userRealm = new UserRealm();
        return userRealm;
    }

    @Bean
    public SecurityManager securityManager(UserRealm realm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置realm.
        securityManager.setRealm(realm);
//        // 记住我
//        securityManager.setRememberMeManager(rememberMeManager());
//        // 注入缓存管理器;
//        securityManager.setCacheManager(getEhCacheManager());
//        // session管理器
//        securityManager.setSessionManager(sessionManager());
        return securityManager;
    }

    /**
     * Shiro过滤器配置
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        // Shiro的核心安全接口,这个属性是必须的
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        // 身份认证失败，则跳转到登录页面的配置
        shiroFilterFactoryBean.setLoginUrl("/login");
        // 权限认证失败，则跳转到指定页面
        //shiroFilterFactoryBean.setUnauthorizedUrl(unauthorizedUrl);
        // Shiro连接约束配置，即过滤链的定义
        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
        // 对静态资源设置匿名访问
        filterChainDefinitionMap.put("/favicon.ico**", "anon");
        filterChainDefinitionMap.put("/paladin.png**", "anon");
        filterChainDefinitionMap.put("/css/**", "anon");
        filterChainDefinitionMap.put("/docs/**", "anon");
        filterChainDefinitionMap.put("/fonts/**", "anon");
        filterChainDefinitionMap.put("/img/**", "anon");
        filterChainDefinitionMap.put("/ajax/**", "anon");
        filterChainDefinitionMap.put("/js/**", "anon");
        filterChainDefinitionMap.put("/ruoyi/**", "anon");
        filterChainDefinitionMap.put("/druid/**", "anon");
        filterChainDefinitionMap.put("/captcha/captchaImage**", "anon");
        // 退出 logout地址，shiro去清除session
        //filterChainDefinitionMap.put("/logout", "logout");
        // 不需要拦截的访问
        //filterChainDefinitionMap.put("/login", "anon,captchaValidate");
        filterChainDefinitionMap.put("/admin/login", "anon");
        //secret登录
        filterChainDefinitionMap.put("/admin/secretLogin", "anon");

        Map<String, Filter> filters = new LinkedHashMap<>();
//        filters.put("onlineSession", onlineSessionFilter());
//        filters.put("syncOnlineSession", syncOnlineSessionFilter());
//        filters.put("captchaValidate", captchaValidateFilter());
        // 注销成功，则跳转到指定页面
//        filters.put("logout", logoutFilter());
        shiroFilterFactoryBean.setFilters(filters);
        // 所有请求需要认证
        //filterChainDefinitionMap.put("/**", "user,onlineSession,syncOnlineSession");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilterFactoryBean;
    }
}
