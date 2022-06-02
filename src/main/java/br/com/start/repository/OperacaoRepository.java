package br.com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.start.model.Operacao;

@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long>{

}
