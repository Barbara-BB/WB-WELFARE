package com.wb.welfare.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wb.welfare.dominio.Cliente;
import com.wb.welfare.repository.ClienteRepository;


@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	@RequestMapping(method=RequestMethod.GET, value="/cadastrocliente")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrocliente");
		modelAndView.addObject("clientebj",new Cliente());
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="**/salvarcliente")
	public ModelAndView salvar(Cliente cliente) {
		clienteRepository.save(cliente);
		ModelAndView andView = new ModelAndView("cadastro/cadastrocliente");
		Iterable<Cliente> clientesIt = clienteRepository.findAll();
		andView.addObject("clientes", clientesIt);
		andView.addObject("clientebj",new Cliente());
		return andView;

	}
	



}
