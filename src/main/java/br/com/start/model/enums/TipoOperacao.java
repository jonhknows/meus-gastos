package br.com.start.model.enums;

public enum TipoOperacao {
	CREDITO("Crédito"),
	DEBITO("Débito");
	
	private String descricao;
	
	private TipoOperacao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}