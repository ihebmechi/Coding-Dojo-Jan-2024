package com.iheb.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        
        String name2 = "BMW ";
        String itemName2 = "M5 Competion";
        double price2 = 50000.00;
        String description2 = "The speed of that car is the best in the world .";
        String vendor2 = "Drag Race Car";

        // Add attributes second test to the model
        model.addAttribute("name2", name2);
        model.addAttribute("itemName2", itemName2);
        model.addAttribute("price2", price2);
        model.addAttribute("description2", description2);
        model.addAttribute("vendor2", vendor2);
        return "index.jsp";
    }
    //...
    

}
