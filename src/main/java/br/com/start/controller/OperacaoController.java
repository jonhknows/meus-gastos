package br.com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.start.model.Operacao;
import br.com.start.service.OperacaoService;

@Controller
@RequestMapping(value = "/extrato")
public class OperacaoController {
	
	@Autowired
	private OperacaoService operacaoService;
	
	@PostMapping(value = "/despesa")
	public String salvarDespesa(@RequestBody Operacao operacao) {
		
		System.out.println(operacao.getValor());
		
		
		
		return "redirect:/despesas";	
		
	}

}
