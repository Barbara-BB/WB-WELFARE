package com.wb.welfare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping(value = {"/","","/home"})
	public String paginaInicial() {
		return "home";
	}
	



	}




