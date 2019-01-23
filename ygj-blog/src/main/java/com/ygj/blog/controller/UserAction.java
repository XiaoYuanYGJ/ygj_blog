package com.ygj.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygj.blog.service.IUserService;

/**
 * 用户控制器
 * 
 * @author ygj
 *
 */
@Controller
public class UserAction {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("message", "测试，查看可以使用，然后搭建基本项目结构");

		return "login";
	}
	
	@RequestMapping(value="/test.html",method=RequestMethod.GET)
	@ResponseBody
	public String test(){
		return "this is response body message ......";
	}

}
