package com.bdu.tmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdu.tmanager.bean.Classteacher;
import com.bdu.tmanager.bean.Result;
import com.bdu.tmanager.bean.ResultCode;
import com.bdu.tmanager.exception.CommonException;
import com.bdu.tmanager.service.ClassteacherService;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/classteacher")
public class ClassteacherController {

    @Autowired
    private ClassteacherService classteacherService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody Classteacher classteacher)  {
        //业务操作
        classteacherService.add(classteacher);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody Classteacher classteacher ) {
        //业务操作
        classteacher.setClassid(id);
        classteacherService.update(classteacher);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        classteacherService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        Classteacher classteacher = classteacherService.findById(id);
        return new Result(ResultCode.SUCCESS,classteacher);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<Classteacher> list = classteacherService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}
