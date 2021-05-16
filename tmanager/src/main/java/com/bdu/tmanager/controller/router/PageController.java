package com.bdu.tmanager.controller.router;

import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "index";
		}
		return "login";
	}
	
	@RequestMapping(value="index2")
	public String index2() {
		HttpSession session = request.getSession();
		String flag = String.valueOf(session.getAttribute("login"));
		if(flag != null) {
			return "/manage/class_integral.html";
		}
		return "login";
	}
}
