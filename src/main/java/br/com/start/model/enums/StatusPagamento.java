package br.com.start.model.enums;

public enum StatusPagamento {
	PENDENTE("Pendente"),
	PAGO("Pago");
	
	private String descricao;
	
	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}