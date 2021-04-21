package com.wb.welfare.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wb.welfare.model.Pedido;

@Controller
public class PedidoController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/pedido")
	public String pedido(Model model) {
		Query query = entityManager.createQuery("select p from Pedido p",Pedido.class);
		List<Pedido> pedidos = query.getResultList();
		
		model.addAttribute("pedidos",pedidos);
		return "pedido";
		
	}

}
