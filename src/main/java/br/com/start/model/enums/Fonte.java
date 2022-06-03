package br.com.start.model.enums;

public enum Fonte {
	CARTEIRA("Carteira"),
	CONTASALARIO("Conta Salário"),
	CONTACORRENTE("Conta Corrente"),
	CONTAPOUPANCA("Conta Poupanca"),
	CARTAO("Cartão de Crédito");
	
	private String descricao;
	
	private Fonte(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}