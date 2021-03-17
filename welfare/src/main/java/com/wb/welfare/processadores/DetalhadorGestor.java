package com.wb.welfare.processadores;

import com.wb.welfare.dominio.Gestor;

public class DetalhadorGestor extends Detalhador<Gestor>{
	@Override
	public void detalhesEspecificos(Gestor g) {
		System.out.println("Acesso: "+ g.getAcesso());
		System.out.println("Função: "+ g.getFuncao());
		System.out.println("Nível: "+ g.getNivel());
		System.out.println("Admissão: "+ g.getAdmissao());
		System.out.println("-----------------------------");

	}
	

}
