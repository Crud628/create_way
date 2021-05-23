package com.wkcto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @EnableGlobalMethodSecurity:启用方法级别的认证
 *      prePostEnabled：boolean 默认是false
 *          true:表示可以使用@PreAuthorize注解 和 @PostAuthorize
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
    //在方法中配置 用户和密码的信息， 作为登录的数据
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder pe = passwordEncoder();

        //定义两个角色 normal, admin
        auth.inMemoryAuthentication()
                .withUser("zhangsan")
                .password(pe.encode("123456"))
                .roles("normal");

        auth.inMemoryAuthentication()
                .withUser("lisi")
                .password(pe.encode("123456"))
                .roles("normal");
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(pe.encode("admin"))
                .roles("admin","normal");

    }

    //创建密码的加密类
    @Bean
    public PasswordEncoder passwordEncoder(){
        //创建PasawordEncoder的实现类， 实现类是加密算法
        return new BCryptPasswordEncoder();
    }

}
