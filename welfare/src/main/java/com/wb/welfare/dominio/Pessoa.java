package com.wb.welfare.dominio;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private String nascimento;
	public String telefone;
	public String genero;
	
	public Pessoa(String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.genero = genero;
	}

	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNascimento() {
		return nascimento;
	}


	public String getTelefone() {
		return telefone;
	}


	public String getGenero() {
		return genero;
	}
	
	

}