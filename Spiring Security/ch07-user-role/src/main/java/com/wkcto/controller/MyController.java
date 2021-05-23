package com.wkcto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/access/user",produces = "text/html;charset=utf-8")
    public String sayUser(){
        return "zs 是 user 角色";
    }

    @GetMapping(value = "/access/read",produces = "text/html;charset=utf-8")
    public String sayRead(){
        return "lisi 是 read 角色";
    }

    @GetMapping(value = "/access/admin",produces = "text/html;charset=utf-8")
    public String sayAdmin(){
        return "admin 是 user ， admin 角色";
    }
}
