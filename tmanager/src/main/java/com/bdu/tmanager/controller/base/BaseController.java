package com.bdu.tmanager.controller.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Controller
public class BaseController {
	@Autowired
	public HttpServletRequest request;
	@Autowired
	public HttpServletResponse response;
	@Autowired
	public HttpSession session;
}
