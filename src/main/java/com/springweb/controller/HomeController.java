package com.springweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "welcome to web page";
    }

    @RequestMapping("/about")
    public String about(){
        return "hey ! this is about page.";
    }
}
