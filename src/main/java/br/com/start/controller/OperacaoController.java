package br.com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.start.model.Operacao;
import br.com.start.service.OperacaoService;

@Controller
@RequestMapping(value = "/operacao")
public class OperacaoController {
	
	@Autowired
	private OperacaoService operacaoService;
	
	@PostMapping(value = "/despesa/salvar")
	public String salvarDespesa(@ModelAttribute Operacao operacao) {
		
		System.out.println(operacao.getValor());
		
		operacaoService.salvar(operacao);
		
		return "redirect:/despesas";	
		
	}

}
