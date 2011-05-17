package com.perso.projectTest1.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EtablissementController {
	
	@RequestMapping("/etablissement/list.do")
	public ModelAndView list()
	{
		 ModelAndView mav = new ModelAndView();
	        mav.setViewName("helloWorld");
	        mav.addObject("message", "Hello World!");
	        mav.setViewName("etablissement/list");
	        return mav;
	}

}
