package com.zahra.appLearning.controller;

import com.zahra.appLearning.model.Person;
import com.zahra.appLearning.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PublicController {

    @Autowired
    PersonService personService;

    @RequestMapping(value="/register" ,method = RequestMethod.GET)
    public String DisplayPage(Model model){
        model.addAttribute("Person" ,new Person());
        return "register.html";

    }
}
