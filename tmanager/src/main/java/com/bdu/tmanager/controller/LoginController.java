package com.bdu.tmanager.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdu.tmanager.bean.Rzgl;
import com.bdu.tmanager.bean.Student;
import com.bdu.tmanager.bean.Teacher;
import com.bdu.tmanager.controller.base.BaseController;
import com.bdu.tmanager.service.RzglService;
import com.bdu.tmanager.service.StudentService;
import com.bdu.tmanager.service.TeacherService;

/**
 * 登录路由控制
 * @author lan
 * 2021年5月16日
 * TODO
 */
@CrossOrigin
@Controller
@RequestMapping(value="/login")
public class LoginController extends BaseController{
	@Autowired
	private TeacherService tService;
	@Autowired
	private StudentService sService;
	@Autowired
	private RzglService rService;
	
	/**
	 * 已经登录的用户
	 */
	public static Map<String,Object> users = new HashMap<String,Object>();
	
	/**
	 * 日志临时记录
	 */
	public static Map<String,Object> logs = new HashMap<String,Object>();
	
	/**
	 * 登陆页面路由
	 * @return
	 */
	@RequestMapping(value="",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	/**
	 * 学生登录
	 * @param student
	 * @return
	 */
	@RequestMapping(value="/student")
	@ResponseBody
	public Map<String,Object> login(Student student) {
		Map<String,Object> data = new HashMap<String,Object>();
		Student s = null;
		try {
			s = sService.findById(student.getId());
		}catch(Exception e) {
			data.put("success", false);
			data.put("errMsg", "用户名不存在");
			return data;
		}
		Object object = users.get(s.getId());
		if(object != null) {
			data.put("success", false);
			data.put("errMsg", "该用户已经登陆");
		}
		if(s.getPassword().equals(student.getPassword())) {
			users.put(s.getId(), s);
			session.setAttribute("login", users);
			//存日志
			Rzgl r = new Rzgl();
			r.setRid(s.getId());
			r.setRname(s.getName());
			r.setIntime(new Date());
			rService.add(r);
			logs.put(r.getRno()+"", r);
			
			data.put("success",true);
			data.put("user", s.getId());
			data.put("log", r.getRno());
		}else {
			data.put("success", false);
			data.put("errMsg", "密码不正确");
		}
		return data;
	}
	
	/**
	 * 教工登录
	 * @param teacher
	 * @return
	 */
	@RequestMapping(value="/teacher")
	@ResponseBody
	public Map<String,Object> login(Teacher teacher) {
		Map<String,Object> data = new HashMap<String,Object>();
		Teacher t=null;
		try {
			t = tService.findById(teacher.getId());
		}catch(Exception e) {
			data.put("success", false);
			data.put("errMsg", "用户名不存在");
			return data;
		}
		if(t.getPassword().equals(teacher.getPassword())) {
			
			session.setAttribute("login", t.getId());
			//存日志
			Rzgl r = new Rzgl();
			r.setRid(t.getId());
			r.setRname(t.getName());
			r.setIntime(new Date());
			rService.add(r);
			logs.put(r.getRno()+"", r);
		}else {
			data.put("success", false);
			data.put("errMsg", "密码不正确");
		}
		return data;
	}
	
	/**
	 * 退出登录
	 * @return
	 */
	@RequestMapping(value="logout")
	public Map<String,Object> logout(String id,String logId){
		Map<String,Object> data = new HashMap<String,Object>();
		
		String flag=null;
		//更新登出记录
		Rzgl r = new Rzgl();
		r.setRno(Integer.parseInt(logId));
		r.setOuttime(new Date());
		rService.update(r);
		data.put("success", true);
		return data;
	}
	
}
