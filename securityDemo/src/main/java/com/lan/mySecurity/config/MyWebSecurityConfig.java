package com.lan.mySecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Security配置
 * 
 * @author lan
 * 2021年6月13日
 * TODO
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //方法级别的验证
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder pe = passwordEcoder();
		auth.inMemoryAuthentication()
			.withUser("zhangsan").password(pe.encode("123456")).roles("normal");
		auth.inMemoryAuthentication()
			.withUser("lisi").password(pe.encode("123456")).roles("normal","admin");
		auth.inMemoryAuthentication()
			.withUser("wangwu").password(pe.encode("123456")).roles("normal");
	}

	@Bean
	public PasswordEncoder passwordEcoder() {
		return new BCryptPasswordEncoder();
	}
	
}
