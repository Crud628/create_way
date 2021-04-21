package com.bdu.tmanager.controller;

import com.bdu.tmanager.bean.Test;
import com.bdu.tmanager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author lan
 * @date 2021/4/21 - 22:02
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService testService;

    /**
     * 测试列表
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    @ResponseBody
    private List<Test> testList(){
        return testService.testList();
    }

    /**
     * 网页跳转  并赋值
     * @return
     */
    @RequestMapping(value = "/m",method = RequestMethod.GET)
    private ModelAndView testHtml(){
        ModelAndView m = new ModelAndView();
        m.setViewName("test");
        m.addObject("hello","hello world!");
        return  m;
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    @ResponseBody
    private Test findById(@PathVariable(value = "id")String id){
        Test test = testService.testOne(id);
        return  test;
    }

    @RequestMapping(value = "" ,method = RequestMethod.POST)
    @ResponseBody
    private boolean saveTest(@RequestBody Test t){
        System.out.println(t);
        return testService.testSave(t);
    }
}
