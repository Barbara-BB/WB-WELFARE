package com.wb.welfare.dominio;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa {
	

	public String funcao;
	private String admissao;
	public String nivel;

	public Funcionario(Long id,String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero,
			String funcao, String admissao, String nivel) {
		super(id,nome, sobrenome, cpf, nascimento, telefone, genero);
		this.funcao = funcao;
		this.admissao = admissao;
		this.nivel = nivel;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getAdmissao() {
		return admissao;
	}

	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	

}
