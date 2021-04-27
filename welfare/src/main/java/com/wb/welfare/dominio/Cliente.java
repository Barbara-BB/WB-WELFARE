package com.wb.welfare.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente extends Pessoa{
	public Cliente(Long id,String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero,
			String tratamento, String pagamento) {
		super(id,nome, sobrenome, cpf, nascimento, telefone, genero);
		this.tratamento = tratamento;
		this.pagamento = pagamento;
	
	}

	private String tratamento;
	private String pagamento;


	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}



	}
