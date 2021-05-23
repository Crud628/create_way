package com.wkcto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
    //在方法中配置 用户和密码的信息， 作为登录的数据
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder pe = passwordEncoder();

        auth.inMemoryAuthentication()
                .withUser("zhangsan")
                .password(pe.encode("123456"))
                .roles();
        auth.inMemoryAuthentication()
                .withUser("lisi")
                .password(pe.encode("123456"))
                .roles();
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password(pe.encode("admin"))
                .roles();

    }

    //创建密码的加密类
    @Bean
    public PasswordEncoder passwordEncoder(){
        //创建PasawordEncoder的实现类， 实现类是加密算法
        return new BCryptPasswordEncoder();
    }

}
