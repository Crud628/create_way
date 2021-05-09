package com.bdu.tmanager.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdu.tmanager.bean.Dailyworkinfo;
import com.bdu.tmanager.bean.Result;
import com.bdu.tmanager.bean.ResultCode;
import com.bdu.tmanager.exception.CommonException;
import com.bdu.tmanager.service.DailyworkinfoService;

//解决跨域问题
@CrossOrigin
@RestController
@RequestMapping(value="/dailyworkinfo")
public class DailyworkinfoController {

    @Autowired
    private DailyworkinfoService dailyworkinfoService;

    //保存
    @RequestMapping(value="",method = RequestMethod.POST)
    public Result save(@RequestBody Dailyworkinfo dailyworkinfo)  {
        //业务操作
        dailyworkinfoService.add(dailyworkinfo);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id更新
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value="id") String id, @RequestBody Dailyworkinfo dailyworkinfo ) {
        //业务操作
        dailyworkinfo.setAutono(id);
        dailyworkinfoService.update(dailyworkinfo);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id删除
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value="id") String id) {
        dailyworkinfoService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    //根据id查询
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable(value="id") String id) throws CommonException {
        Dailyworkinfo dailyworkinfo = dailyworkinfoService.findById(id);
        return new Result(ResultCode.SUCCESS,dailyworkinfo);
    }

    //查询全部
    @RequestMapping(value="",method = RequestMethod.GET)
    public Result findAll() {
        List<Dailyworkinfo> list = dailyworkinfoService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }
}
