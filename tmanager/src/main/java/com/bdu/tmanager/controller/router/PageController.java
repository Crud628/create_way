package com.bdu.tmanager.controller.router;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bdu.tmanager.bean.Dailyworkinfo;
import com.bdu.tmanager.bean.PageResult;
import com.bdu.tmanager.bean.Scoreinfo;
import com.bdu.tmanager.controller.LoginController;
import com.bdu.tmanager.controller.base.BaseController;
import com.bdu.tmanager.service.DailyworkinfoService;
import com.bdu.tmanager.service.ScoreinfoService;

//解决跨域问题
@CrossOrigin
@Controller
public class PageController extends BaseController{
	
	@Autowired
	DailyworkinfoService dailyService;
	
	@Autowired
	ScoreinfoService socreService;
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
	
	/**********************************主页面菜单路由***********************************/
	/**
	 * 班主任活动列表
	 * @param page 页码
	 * @return
	 */
	@RequestMapping(value="list")
	public ModelAndView list(Integer page) {
		ModelAndView mav = new ModelAndView();
		Page<Dailyworkinfo> findAll = dailyService.findAll(page); 
		mav.addObject("head",findAll.hasPrevious());
		mav.addObject("next",findAll.hasNext());
		mav.addObject("list",findAll.getContent());
		mav.addObject("pages",findAll.getTotalPages());
		mav.setViewName("manage/list.html");
		return mav;
	}
	
	/**
	 * 学生信息设置
	 * @return
	 */
	@RequestMapping(value="student/p")
	public String student() {
		return "/manage/student";
	}
	
	/**
	 * 积分管理选择
	 * @return
	 */
	@RequestMapping(value="p")
	public String integral() {
		return "/manage/integral";
	}
	/**
	 * 班主任日常事物管理
	 * @return
	 */
	@RequestMapping(value="daily/p")
	public String daily() {
		return "/manage/daily";
	}

	/**
	 * 消息公布、留言板
	 * @return
	 */
	@RequestMapping(value="message/p")
	public String message() {
		return "/manage/message";
	}

	/**
	 * 用户权限
	 * @return
	 */
	@RequestMapping(value="popedon/p")
	public String popedon() {
		return "/manage/popedon";
	}

	/**
	 * 登入、登出管理
	 * @return
	 */
	@RequestMapping(value="log/p")
	public String log() {
		return "/manage/log";
	}
	
	
	/******************************************班级积分路由配置***********************************/
	
	@RequestMapping(value="class/list")
	public ModelAndView classIntegralAll(Integer page) {
		ModelAndView mav = new ModelAndView();
		Page<Scoreinfo> findAll = socreService.findAll(page); 
		mav.addObject("head",findAll.hasPrevious());
		mav.addObject("next",findAll.hasNext());
		mav.addObject("list",findAll.getContent());
		mav.addObject("pages",findAll.getTotalPages());
		mav.setViewName("manage/class_integral_list");
		return mav;
	}
	
	
	@RequestMapping(value="class/edit")
	public ModelAndView classIntegralEdit(Integer id) {
		ModelAndView mav = new ModelAndView();
		Scoreinfo score = socreService.findById(id);
		mav.addObject("data",score);
		mav.setViewName("manage/class_integral_edit");
		return mav;
	}
	
	@RequestMapping(value="class/add")
	public String classIntegralAdd() {
		return  "manage/class_integral_add";
	}
	
	/******************************************班主任路由配置***********************************/
	/**
	 * 班主任日常事物新增
	 * @return
	 */
	@RequestMapping(value="t/make")
	public String make(){
		return "manage/make";
	}
	//学生积分管理
	@RequestMapping(value="s/integary")
	public String studentIntegary() {
		return "/manage/student_integral.html";
	}
}
