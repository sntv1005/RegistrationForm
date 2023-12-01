package com.example.demo.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Entity.User;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class UserController {
	

	@GetMapping("/")
	public String register(Model model) {
		User user = new User();
		model.addAttribute("user", user);
;		
		
		
		return"register";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute("user") User user ) {
		System.out.println(user);
		
		return " home ";
	}
	
	public class CustomErrorController implements ErrorController {


		  @RequestMapping("/error")
		  @ResponseBody
		  String error(HttpServletRequest request) {
		    return "<h1>Error occurred</h1>";
		  }

		  
		  public String getErrorPath() {
		    return "/error";
		  }
		}

}
