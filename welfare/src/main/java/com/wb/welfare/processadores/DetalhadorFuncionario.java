package com.wb.welfare.processadores;

import com.wb.welfare.dominio.Funcionario;

public class DetalhadorFuncionario extends Detalhador<Funcionario> {

	@Override
	public void detalhesEspecificos(Funcionario f) {
		System.out.println("Admissão: "+ f.getAdmissao());
		System.out.println("Função: "+ f.getFuncao());
		System.out.println("Nível: "+ f.getNivel());
		System.out.println("-----------------------------");

	}

}