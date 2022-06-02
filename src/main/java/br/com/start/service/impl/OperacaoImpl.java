package br.com.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.start.repository.OperacaoRepository;
import br.com.start.service.OperacaoService;

public class OperacaoImpl implements OperacaoService{
	
	@Autowired
	private OperacaoRepository operacaoRepository;

}
