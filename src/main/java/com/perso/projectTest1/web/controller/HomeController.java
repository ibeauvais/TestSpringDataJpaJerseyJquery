package com.perso.projectTest1.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @RequestMapping({ "/","/home.do"})
    public ModelAndView list() {

        ModelAndView mav = new ModelAndView("home");


        return mav;
    }


}
