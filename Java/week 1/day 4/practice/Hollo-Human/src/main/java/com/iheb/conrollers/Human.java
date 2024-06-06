package com.iheb.conrollers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Human {
    @RequestMapping("/")

    public String index(@RequestParam(value="name", required=false) String searchQuery,
                        @RequestParam(value="lastName", required=false) String searchQuery2,
                        @RequestParam(value="time", required=false, defaultValue = "1") int searchQuery3){
        // declare a variable to hold the message
        String message;

        //conditional statement to check if the searchQuery is null
        if (searchQuery == null) {
            message = "Hello Human! ";
        } 
        //
        else if (searchQuery2 == null) {
            message = "Hello " + searchQuery + "! ";
        }
        else {
            message ="Hello " + searchQuery + " " + searchQuery2 + "! " ;
        }
    // return the message repeated searchQuery3 times
    return message.repeat(searchQuery3);
    }
        
}




