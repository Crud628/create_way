package com.bdu.tmanager.controller.router;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bdu.tmanager.bean.Dailyworkinfo;
import com.bdu.tmanager.bean.PageResult;
import com.bdu.tmanager.controller.LoginController;
import com.bdu.tmanager.controller.base.BaseController;
import com.bdu.tmanager.service.DailyworkinfoService;

//解决跨域问题
@CrossOrigin
@Controller
public class PageController extends BaseController{
	
	@Autowired
	DailyworkinfoService dailyService;
	/**
	 * 主页跳转，登录状态为空
	 * 		则跳转到登录页
	 * @return 跳转页面
	 */
	@RequestMapping(value="index")
	public String index(String id) {
		boolean flag = LoginController.logs.get(id)==null;
		if(!flag) {
			return "index";
		}
		return "login";
	}
	
	@RequestMapping(value="list")
	public ModelAndView list(Integer page) {
		ModelAndView mav = new ModelAndView();
		//
		List<Dailyworkinfo> list = dailyService.findAll();
		mav.addObject("list",list);
		mav.setViewName("manage/list.html");
		return mav;
	}

	@RequestMapping(value="student/p")
	public String student() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/student";
		}
		return "login";
	}


	@RequestMapping(value="daily/p")
	public String daily() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/daily";
		}
		return "login";
	}

	@RequestMapping(value="message/p")
	public String message() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/message";
		}
		return "login";
	}

	@RequestMapping(value="popedon/p")
	public String popedon() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/popedon";
		}
		return "login";
	}

	@RequestMapping(value="log/p")
	public String log() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/log";
		}
		return "login";
	}
}
