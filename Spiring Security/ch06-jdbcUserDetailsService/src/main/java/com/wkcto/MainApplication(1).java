package com.wkcto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("==============Main2=============");
        SpringApplication.run(MainApplication.class,args);
    }
}
