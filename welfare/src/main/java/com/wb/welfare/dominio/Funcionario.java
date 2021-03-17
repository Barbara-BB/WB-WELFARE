package com.wb.welfare.dominio;

public class Funcionario extends Pessoa {
	

	public String funcao;
	private String admissao;
	public String nivel;

	public Funcionario(String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero,
			String funcao, String admissao, String nivel) {
		super(nome, sobrenome, cpf, nascimento, telefone, genero);
		this.funcao = funcao;
		this.admissao = admissao;
		this.nivel = nivel;
	}
	public String getAdmissao() {
		return admissao;
	}
	public String getFuncao() {
		return funcao;
	}
	public String getNivel() {
		return nivel;
	}
	

}
