package com.ygj.blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ygj.blog.service.IUserService;
import com.ygj.blog.status.utils.UserStatus;
import com.ygj.blog.utils.Message;

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
	
	
	@RequestMapping(value="/db-test.do",method=RequestMethod.GET)
	public String testDB(Model model,HttpServletRequest req){
		
		String nameOrPhone = req.getParameter("userName");
		
		Message<UserStatus> messgae= userService.findUserByUserNameOrPhone(nameOrPhone);
		
		model.addAttribute("message", messgae.getObj());
		
		return "login";
	}
	
 
}
