package com.mmdoss;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mmdoss.Service.UserService;
import com.mmdoss.models.User;

@Controller
public class UserController {
	
	@RequestMapping("/login")
	public ModelAndView doLogin() {
		return new ModelAndView("login", "User", new User());
	}
	@RequestMapping(value="/doLogin", method=RequestMethod.POST)
	public ModelAndView authenticate(@ModelAttribute("User") User user,BindingResult bindingResult) {
		ModelAndView model=new ModelAndView();
		if(bindingResult.hasErrors())
			model.setViewName("error");
		else {
			boolean validate = UserService.validate(user.getUsername(),user.getPassword());
			if(validate) {
				model.setViewName("success");
			}
			else {
				model.setViewName("error");
			}
		}
		return model;
	}
}
