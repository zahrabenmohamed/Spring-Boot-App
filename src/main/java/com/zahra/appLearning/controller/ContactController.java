package com.zahra.appLearning.controller;

import com.zahra.appLearning.model.Contact;
import com.zahra.appLearning.service.ContactService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@Slf4j
public class ContactController {

    @Autowired
    private ContactService contactService;


    @RequestMapping(value={"/contact"})
    public String DisplayContactPage(Model model){
        model.addAttribute("contact" ,new Contact());
        return "contact.html";
    }

}
