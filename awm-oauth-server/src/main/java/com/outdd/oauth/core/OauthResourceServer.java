package com.outdd.oauth.core;

import com.outdd.common.constants.Constants;
import com.outdd.oauthCommon.exception.AuthExceptionEntryPoint;
import com.outdd.oauthCommon.exception.CustomAccessDeniedHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * 资源服务器
 */
//@Order(2)
//@Configuration
//@EnableResourceServer
//@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class OauthResourceServer {//extends ResourceServerConfigurerAdapter {
//
//    @Autowired
//    CustomAccessDeniedHandler customAccessDeniedHandler;
//    //资源安全配置
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//
//        resources
//                .resourceId(Constants.DEMO_RESOURCE_ID)//绑定客户端id
//                .authenticationEntryPoint(new AuthExceptionEntryPoint())//无权限操作
//                .accessDeniedHandler(customAccessDeniedHandler)
//                .stateless(true);
//    }
//
//    //http安全配置
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        http
//                // Since we want the protected resources to be accessible in the UI as well we need
//                // session creation to be allowed (it's disabled by default in 2.0.6)
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and()
//                .requestMatchers().anyRequest()
//                .and()
//                .anonymous()
//                .and()
//                .authorizeRequests()
////                    .antMatchers("/product/**").access("#oauth2.hasScope('select') and hasRole('ROLE_USER')")
//                .antMatchers("/order/**","/user/**").authenticated()
//                .and().csrf().disable();//配置order访问控制，必须认证过后才可以访问
//        // @formatter:on
//    }
}