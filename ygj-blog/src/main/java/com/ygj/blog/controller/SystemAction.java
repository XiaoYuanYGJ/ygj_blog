package com.ygj.blog.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ygj.blog.utils.VerifyCodeUtils;

/**
 * 
 * @author xiaohe
 * @Date 2019年1月24日
 * @Description 系统控制器
 */
@Controller
public class SystemAction {

	private Logger LOG = LoggerFactory.getLogger(SystemAction.class);

	@RequestMapping(value = "/lg-auth-code", method = RequestMethod.GET)
	public void lgAuthCode(HttpSession session, HttpServletResponse response) {

		try {

			// 生成长度为5位随机验证码
			String verifyCode = VerifyCodeUtils.generateVerifyCode(5);

			// 放置session中
			session.setAttribute("loginVerifyCode", verifyCode);

			LOG.debug("登录验证码-----》》》》》》》》" + verifyCode);

			// 输出图片流
			VerifyCodeUtils.outputImage(200, 80, response.getOutputStream(), verifyCode);

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();

			LOG.error("登录验证生成发生异常，信息如下-----》》》》》" + e.getCause().getMessage());
		}

	}

	@RequestMapping(value = "/reg-auth-code", method = RequestMethod.GET)
	public void regAuthCode(HttpSession session, HttpServletResponse response) {

		try {
			String verifyCode = VerifyCodeUtils.generateVerifyCode(6);

			session.setAttribute("regVerifyCode", verifyCode);

			LOG.debug("注册验证码----》》》》》》》" + verifyCode);

			VerifyCodeUtils.outputImage(200, 80, response.getOutputStream(), verifyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			LOG.error("注册验证码生成发生异常，信息如下--------》》》》》》》" + e.getCause().getMessage());
		}

	}

}
