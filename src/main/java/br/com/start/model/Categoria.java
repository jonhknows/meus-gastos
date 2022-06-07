package br.com.start.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.com.start.model.enums.TipoOperacao;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	private Boolean ativo;
	
	@OneToMany(mappedBy = "categoria")
	private List<Subcategoria> subcategorias;
	
	private TipoOperacao tipoOperacao;
	
	@OneToMany(mappedBy = "categoria")
	private List<Operacao> operacoes;	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public List<Subcategoria> getSubcategorias() {
		return subcategorias;
	}
	
	public void setSubcategorias(List<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public List<Operacao> getOperacoes() {
		return operacoes;
	}
	
	public void setOperacoes(List<Operacao> operacoes) {
		this.operacoes = operacoes;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}	

}
