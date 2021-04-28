package com.wb.welfare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SalaoController {
	
	
	@RequestMapping(method=RequestMethod.GET, value="/salao")
	public String paginaSecundaria() {
		return "salao";
	}

	}
