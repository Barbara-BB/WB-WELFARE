package com.wb.welfare.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wb.welfare.dominio.Cliente;
import com.wb.welfare.dominio.Telefone;
import com.wb.welfare.repository.ClienteRepository;
import com.wb.welfare.repository.TelefoneRepository;


@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired 
	private TelefoneRepository telefoneRepository;
	@RequestMapping(method=RequestMethod.GET, value="/cadastrocliente")
	public ModelAndView cadastro() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastrocliente");
		Iterable<Cliente> clientesIt = clienteRepository.findAll();
		modelAndView.addObject("clientes", clientesIt);
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
	
	@PostMapping("**/addfoneCliente/{clienteid}")
	public ModelAndView addFoneCliente(Telefone telefone, @PathVariable("clienteid") Long clienteid){
		
		Cliente cliente=clienteRepository.findById(clienteid).get();
		telefone.setCliente(cliente);
		telefoneRepository.save(telefone);
		
		ModelAndView modelAndView = new ModelAndView("cadastro/telefones");
		modelAndView.addObject("clientebj", cliente);

		return modelAndView;
	}
	



}
