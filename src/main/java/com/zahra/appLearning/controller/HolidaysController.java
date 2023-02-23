package com.zahra.appLearning.controller;

import com.zahra.appLearning.model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HolidaysController {

  @GetMapping("/holidays")
    public String DisplayHoliday(Model model){
      List<Holiday> holidays= Arrays.asList(
              new Holiday("JAN 1","New year's day",Holiday.Type.FESTIVAL),
              new Holiday("Oct 31","Halloween",Holiday.Type.FEDERAL)
      );
      return "holidays.html";

  }
}
