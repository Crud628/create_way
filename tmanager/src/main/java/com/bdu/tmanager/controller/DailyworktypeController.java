package com.bdu.tmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdu.tmanager.bean.Dailyworktype;
import com.bdu.tmanager.bean.Result;
import com.bdu.tmanager.bean.ResultCode;
import com.bdu.tmanager.exception.CommonException;
import com.bdu.tmanager.service.DailyworktypeService;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/dailyworktype")
public class DailyworktypeController {

    @Autowired
    private DailyworktypeService dailyworktypeService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody Dailyworktype dailyworktype)  {
        //业务操作
        dailyworktypeService.add(dailyworktype);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody Dailyworktype dailyworktype ) {
        //业务操作
        dailyworktype.setId(id);
        dailyworktypeService.update(dailyworktype);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        dailyworktypeService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        Dailyworktype dailyworktype = dailyworktypeService.findById(id);
        return new Result(ResultCode.SUCCESS,dailyworktype);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<Dailyworktype> list = dailyworktypeService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}
