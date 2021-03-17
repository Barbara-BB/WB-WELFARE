package com.wb.welfare.processadores;

import java.util.ArrayList;

import com.wb.welfare.dominio.Cliente;
import com.wb.welfare.dominio.Funcionario;
import com.wb.welfare.dominio.Gestor;
import com.wb.welfare.dominio.Pessoa;


public class Cadastrador {
	private Detalhador detalhador;
	public ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void detalhar() {
		for (Pessoa t : pessoas) {
			if(t instanceof Cliente) {
				detalhador = new DetalhadorCliente();
			}
			if(t instanceof Funcionario) {
				detalhador = new DetalhadorFuncionario();
			}
			if(t instanceof Gestor) {
				detalhador = new DetalhadorGestor();
			}
			detalhador.detalhes(t);
			detalhador.detalhesEspecificos(t);
		
		}

	}

}