package br.com.start.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

@Entity
public class Operacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NumberFormat(pattern = "#,##0.##")
	private BigDecimal valor;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataOperacao;
	
	@Lob
	private byte[] anexoComprovante;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public byte[] getAnexoComprovante() {
		return anexoComprovante;
	}
	public void setAnexoComprovante(byte[] anexoComprovante) {
		this.anexoComprovante = anexoComprovante;
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
