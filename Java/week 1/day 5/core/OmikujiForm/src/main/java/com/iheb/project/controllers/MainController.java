package com.iheb.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/login")
	public String Login(
			@RequestParam("number")int number ,
			@RequestParam("city")String city ,
			@RequestParam("person")String person ,
			@RequestParam("hobby")String hobby ,
			@RequestParam("live")String live ,
			@RequestParam("good")String good ,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("live", live);
		session.setAttribute("good", good);
		return "redirect:/home";
	}
	@RequestMapping("/home")
	public String home() {
		return "welcome.jsp";
	}	
}
