package com.bdu.tmanager.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bdu.tmanager.bean.Result;
import com.bdu.tmanager.bean.ResultCode;
import com.bdu.tmanager.bean.Teacher;
import com.bdu.tmanager.exception.CommonException;
import com.bdu.tmanager.service.TeacherService;


import java.util.List;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody Teacher teacher)  {
        //业务操作
        teacherService.add(teacher);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody Teacher teacher ) {
        //业务操作
        teacher.setId(id);
        teacherService.update(teacher);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        teacherService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        Teacher teacher = teacherService.findById(id);
        return new Result(ResultCode.SUCCESS,teacher);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<Teacher> list = teacherService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}
