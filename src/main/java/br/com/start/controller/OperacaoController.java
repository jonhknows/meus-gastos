package br.com.start.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.start.model.Operacao;
import br.com.start.service.OperacaoService;

@Controller
@RequestMapping(value = "/operacao")
public class OperacaoController {
	
	@Autowired
	private OperacaoService operacaoService;
	
	@PostMapping(value = "/despesa/salvar")
	public String salvarDespesa(@ModelAttribute Operacao operacao, @RequestParam("file") MultipartFile  file) throws IOException {
		
	
		System.out.println(operacao.getPago());
		
		String fileEncoded = Base64.getEncoder().encodeToString(file.getBytes());
		
		operacao.setAnexoComprovante(fileEncoded);		
		operacaoService.salvar(operacao);
		
		return "redirect:/despesas";	
		
	}

}
