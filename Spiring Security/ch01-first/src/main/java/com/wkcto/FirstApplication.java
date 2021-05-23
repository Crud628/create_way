package com.wkcto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//排除Secuirty的配置，让他不启用
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class FirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }
}
