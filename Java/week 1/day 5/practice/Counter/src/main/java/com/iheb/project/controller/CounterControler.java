package com.iheb.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterControler {
	@RequestMapping("/")
	public String index(HttpSession session) {
		session.setAttribute("name", "iheb");
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String welcome(HttpSession session) {
		String userName = (String) session.getAttribute("name");
		System.out.println("the name is " + userName);
		return "Welcome.jsp";
	}
}
