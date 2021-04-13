package com.wb.welfare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalaoController {
	@GetMapping("/salao")
	public String paginaInicial() {
		return "salao";
	}

	}
