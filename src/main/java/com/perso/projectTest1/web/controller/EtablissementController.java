package com.perso.projectTest1.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.perso.projectTest1.model.Etablissement;
import com.perso.projectTest1.repositories.EtablissementDao;

@Controller
public class EtablissementController {
	
	@Autowired
	private EtablissementDao etablissementDao;
	
	@RequestMapping("/etablissement/list.do")
	public ModelAndView list()
	{
		List<Etablissement> etablissements=etablissementDao.findAll();
		 ModelAndView mav = new ModelAndView();
	        mav.setViewName("helloWorld");
	        mav.addObject("message", "Hello World!");
	        mav.setViewName("etablissement/list");
	        return mav;
	}

}
