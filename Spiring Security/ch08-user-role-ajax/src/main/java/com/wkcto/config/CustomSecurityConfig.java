package com.wkcto.config;

import com.wkcto.filter.VerificationCodeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Configuration
@EnableWebSecurity
public class CustomSecurityConfig extends WebSecurityConfigurerAdapter {

    //把SuccssHandler , FailureHandler注入进来
    @Autowired
    private AuthenticationSuccessHandler successHandler;

    @Autowired
    private AuthenticationFailureHandler failureHandler;

    @Autowired
    private UserDetailsService userDetailsService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        System.out.println("=======configure HttpSecurity========== ");
        http.authorizeRequests()
                //指定那些地址可以直接访问， 和登录有关的需要进行指定
                .antMatchers("/index","/myajax.html","/login","/js/**","/captcha/**").permitAll()
                .antMatchers("/access/user/**").hasRole("USER")
                .antMatchers("/access/read/**").hasRole("READ")
                .antMatchers("/access/admin/**").hasRole("AMDIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .successHandler(successHandler)
                .failureHandler(failureHandler)
                .loginPage("/myajax.html")  //登录的自定义视图页面
                .loginProcessingUrl("/login") //form中登录的访问uri地址
                .and()
                //关于跨域访问的安全设置，先禁用
                .csrf().disable();

        //在框架的过滤器链条中，增加一个自定义过滤器
        http.addFilterBefore(new VerificationCodeFilter(), UsernamePasswordAuthenticationFilter.class);


    }



}
