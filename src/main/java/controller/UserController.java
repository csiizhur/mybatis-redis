package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.TUser;
import service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/detail")
	public String detail(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		TUser user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "user_detail"; 
	}
}