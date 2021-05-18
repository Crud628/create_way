package com.bdu.tmanager.controller.router;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdu.tmanager.controller.base.BaseController;

//解决跨域问题
@CrossOrigin
@Controller
public class PageController extends BaseController{
	
	/**
	 * 主页跳转，登录状态为空
	 * 		则跳转到登录页
	 * @return 跳转页面
	 */
	@RequestMapping(value="index")
	public String index() {
		Object flag = session.getAttribute("login");
		if(flag != null) {
			return "index";
		}
		return "login";
	}
	
	@RequestMapping(value="list")
	public String list() {
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/list";
		}
		return "login";
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
