package com.learning.controller;

/**
 * Created by Templar on 13.08.2019.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    @RequestMapping("/api")
    public String mainPage(){
        return "index.html";
    }

    @RequestMapping("/form")
    public String regForm(){
        return "reg_form";
    }
}
