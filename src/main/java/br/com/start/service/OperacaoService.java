package br.com.start.service;

import org.springframework.stereotype.Service;

import br.com.start.model.Operacao;

@Service
public interface OperacaoService {
	
	Operacao salvar(Operacao operacao);

}
