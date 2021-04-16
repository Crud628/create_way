package com.ihrm.common.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String companyId;
    protected String companyName;

    //在进入控制层方法之前执行的方法
    @ModelAttribute
    public void setResAnReq(HttpServletRequest request,HttpServletResponse response) {
        this.request = request;
        this.response = response;
        /**
         * 目前使用 companyId = 1
         *         companyName = "test"
         */
        this.companyId = "1";
        this.companyName = "test";
    }

}
