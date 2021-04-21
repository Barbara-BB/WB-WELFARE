package com.wb.welfare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.wb.welfare.model.Pedido;
import com.wb.welfare.repository.PedidoRepository;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository repository;

	@GetMapping("/pedido")
	public String home(Model model) {

		List<Pedido> pedidos = repository.recuperaTodoOsPedidos();
		model.addAttribute("pedidos",pedidos);
		return "pedido";
	}

}




