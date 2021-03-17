package com.wb.welfare.processadores;

import com.wb.welfare.dominio.Cliente;


public class DetalhadorCliente extends Detalhador<Cliente>{
	@Override
	public void detalhesEspecificos(Cliente c) {
		System.out.println("Tratamento: "+ c.getTratamento());
		System.out.println("Pagamento: "+ c.getPagamento());
		System.out.println("-----------------------------");
		

	}
	

}
