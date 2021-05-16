package com.bdu.tmanager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bdu.tmanager.bean.Student;
import com.bdu.tmanager.bean.Teacher;
import com.bdu.tmanager.controller.base.BaseController;
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
		if(s.getPassword().equals(student.getPassword())) {
			data.put("success",true);
			session.setAttribute("login", s.getId());
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
			data.put("success",true);
			session.setAttribute("login", t.getId());
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
	public Map<String,Object> logout(){
		Map<String,Object> data = new HashMap<String,Object>();
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			session.removeAttribute("login");
			data.put("success", true);
			return data;
		}
		data.put("success", false);
		return data;
	}
	
}
