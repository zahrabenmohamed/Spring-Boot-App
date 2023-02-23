package com.zahra.appLearning.controller;

import com.zahra.appLearning.model.Contact;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ContactController {

    private  static Logger log=LoggerFactory.getLogger(ContactController.class);

    @RequestMapping(value={"/contact"})
    public String DisplayContactPage(){
        return "contact.html";
    }

    @RequestMapping(value={"/saveMsg"},method = RequestMethod.POST)
    public ModelAndView saveMessage(@RequestParam Contact contact){
        
        return  new ModelAndView("redirect:/contact");

    }
}
