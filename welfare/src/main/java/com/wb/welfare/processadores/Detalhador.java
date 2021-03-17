package com.wb.welfare.processadores;


import com.wb.welfare.dominio.Pessoa;

//s�o estruturas que especificam um ou mais comportamentos que uma classe deve ter
// a  principio interface possui metodos abstratos
//T comportamento gen�rico
public abstract class Detalhador<T> {
	public abstract void detalhesEspecificos(T t);
	
	public void detalhes(Pessoa p) {
		System.out.println("Nome: "+ p.getNome());
		System.out.println("Sobrenome: "+ p.getSobrenome());
		System.out.println("CPF: "+ p.getCpf());
		System.out.println("Nascimento: "+ p.getNascimento());
		System.out.println("Telefone: "+ p.getTelefone());
		System.out.println("Genero: "+ p.getGenero());

	}
}