package com.wkcto.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ApplicationConfig {

    //通过spring容器注入 DataSource
    @Autowired
    private DataSource dataSource;

    //创建PasswordEncoder对象
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    //创建JdbcUserDetatilsService对象
    @Bean(name = "jdbcUserDetatilsService")
    public UserDetailsService jdbcUserDetatilsService(){
        System.out.println("===dataSource==="+dataSource);
        PasswordEncoder encoder = passwordEncoder();

        //初始数据源DataSource --- JdbcTemplate对象
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);

        //如果数据库中已经存在账号不添加
        if( !manager.userExists("admin")){
            manager.createUser(User.withUsername("admin")
                    .password(encoder.encode("admin"))
                    .roles("ADMIN","USER","MANAGER").build());
        }

        if( !manager.userExists("zs")){
            manager.createUser(User.withUsername("zs").
                    password(encoder.encode("123"))
                    .roles("USER").build());
        }


        if( !manager.userExists("lisi")){
            manager.createUser(User.withUsername("lisi")
                    .password(encoder.encode("456"))
                    .roles("USER","NORMAL").build());
        }


        return manager;
    }
}
