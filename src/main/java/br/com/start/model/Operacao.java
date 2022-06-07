package br.com.start.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import br.com.start.model.enums.Fonte;
import br.com.start.model.enums.StatusPagamento;

@Entity
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;
	
	@NumberFormat(pattern = "#,##0.##")
	private BigDecimal valor;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataOperacao;
	
	@Lob
	private String anexoComprovante;
	
	private String obs;
	
	private StatusPagamento pago;
	
	@ManyToOne
	@JoinColumn(name = "fk_cateogoria")
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "fk_subcateogoria")
	private Subcategoria subcategoria;
	
	private Fonte fonte;

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(LocalDate dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public String getAnexoComprovante() {
		return anexoComprovante;
	}

	public void setAnexoComprovante(String anexoComprovante) {
		this.anexoComprovante = anexoComprovante;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public StatusPagamento getPago() {
		return pago;
	}

	public void setPago(StatusPagamento pago) {
		this.pago = pago;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}

	public Fonte getFonte() {
		return fonte;
	}

	public void setFonte(Fonte fonte) {
		this.fonte = fonte;
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
		Operacao other = (Operacao) obj;
		return Objects.equals(id, other.id);
	}
}
