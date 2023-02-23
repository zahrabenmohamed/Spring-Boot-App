package com.zahra.appLearning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={" ","/","/home"})
    public String DisplayHomePage(Model model){
        return "home.html" ;
    }


}
