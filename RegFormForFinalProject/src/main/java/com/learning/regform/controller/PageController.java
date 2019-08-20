package com.learning.regform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String mainPage(){
        return "greeting.html";
    }

    @RequestMapping("/register")
    public String registerPage(){
        return "register.html";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login.html";
    }
}
