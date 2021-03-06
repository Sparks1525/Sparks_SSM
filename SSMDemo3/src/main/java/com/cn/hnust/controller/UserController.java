package com.cn.hnust.controller;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		//int userId = 1;
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
}
