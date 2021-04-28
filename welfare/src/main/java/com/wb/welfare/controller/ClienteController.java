package com.wb.welfare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wb.welfare.dominio.Cliente;
import com.wb.welfare.repository.ClienteRepository;


@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	@RequestMapping(method=RequestMethod.GET, value="/cadastrocliente")
	public String cadastro() {
		return "cadastro/cadastrocliente";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/salvarcliente")
	public String salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		return "cadastro/cadastrocliente";
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/listaclientes")
	public ModelAndView clientes() {
		
		ModelAndView andView = new ModelAndView("cadastro/cadastrocliente");
		Iterable<Cliente> clientesIt = clienteRepository.findAll();
		andView.addObject("clientes", clientesIt);
		return andView;
		
	}

}
