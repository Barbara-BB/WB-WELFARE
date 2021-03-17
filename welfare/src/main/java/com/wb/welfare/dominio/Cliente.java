package com.wb.welfare.dominio;

public class Cliente extends Pessoa{
	private String tratamento;
	private String pagamento;

	public Cliente(String nome, String sobrenome, String cpf, String nascimento, String telefone, String genero,
			String tratamento, String pagamento) {
		super(nome, sobrenome, cpf, nascimento, telefone, genero);
		this.tratamento = tratamento;
		this.pagamento = pagamento;
	}



	public String getTratamento() {
		return tratamento;
	}



	public String getPagamento() {
		return pagamento;
	}
}
