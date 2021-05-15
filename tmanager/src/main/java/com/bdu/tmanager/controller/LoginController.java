package com.bdu.tmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bdu.tmanager.bean.Student;

@CrossOrigin
@Controller
@RequestMapping(value="/login")
public class LoginController {
	@RequestMapping(value="",method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/student")
	public ModelAndView login(Student student) {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}
