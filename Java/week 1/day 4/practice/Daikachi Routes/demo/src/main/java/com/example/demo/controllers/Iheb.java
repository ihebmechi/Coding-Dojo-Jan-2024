package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/daikichi")
public class Iheb {

	    @RequestMapping("")
	    public String index(){
	      return "Welcome";
	    }
	    @RequestMapping("/today")
	    public String hello(){
	      return "Today you will find in all your endeavors !";
	    }
	    @RequestMapping("/tomorrow")
	    public String world(){
	      return "Tomorrow, an opportunity will arise, so be sure to be open new ideas!";
	    }
}
