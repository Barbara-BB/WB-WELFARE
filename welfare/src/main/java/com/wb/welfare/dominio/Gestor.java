package com.wb.welfare.dominio;

public class Gestor extends Pessoa{
	public String acesso;
	public String funcao;
	public String nivel;
	private String admissao;
	
	public Gestor(String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero,
			String acesso, String funcao, String admissao, String nivel) {
		super(nome, sobrenome, cpf, nascimento, telefone, genero);
		this.acesso = acesso;
		this.funcao = funcao;
		this.admissao = admissao;
		this.nivel = nivel;
	}
	
	public String getAcesso() {
		return acesso;
	}

	public String getFuncao() {
		return funcao;
	}

	public String getNivel() {
		return nivel;
	}

	public String getAdmissao() {
		return admissao;
	}
	}
	