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
public class BuscaclienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@RequestMapping(method = RequestMethod.GET, value="/buscacliente")
	public ModelAndView clientes() {
		
		ModelAndView andView = new ModelAndView("cadastro/buscacliente");
		Iterable<Cliente> clientesIt = clienteRepository.findAll();
		andView.addObject("clientes", clientesIt);
		andView.addObject("clientebj",new Cliente());
		return andView;
		
	}
	
	@GetMapping("/editarcliente/{idcliente}")
	public ModelAndView editar(@PathVariable("idcliente") Long idcliente) {
		Optional<Cliente> cliente = clienteRepository.findById(idcliente);
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrocliente");
		modelAndView.addObject("clientebj",cliente.get());
		return modelAndView;
		
		
	}
	
	@GetMapping("/excluircliente/{idcliente}")
	public ModelAndView excluir(@PathVariable("idcliente") Long idcliente) {
		clienteRepository.deleteById(idcliente);
		ModelAndView modelAndView = new ModelAndView("cadastro/buscacliente");
		modelAndView.addObject("clientes",clienteRepository.findAll());
		return modelAndView;
		
		
	}
	
	@PostMapping("**/pesquisarcliente")
	public ModelAndView pesquisar(@RequestParam("nomepesquisa") String nomepesquisa) {
		ModelAndView modelAndView = new ModelAndView("cadastro/buscacliente");
		modelAndView.addObject("clientes", clienteRepository.findClienteByName(nomepesquisa));
		modelAndView.addObject("clientebj",new Cliente());
		return modelAndView;
		
	}
}
