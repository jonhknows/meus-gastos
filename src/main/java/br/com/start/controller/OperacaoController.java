package br.com.start.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Base64;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.start.model.Operacao;
import br.com.start.service.OperacaoService;

@Controller
@RequestMapping(value = "/operacao")
public class OperacaoController {
	
	@Autowired
	private OperacaoService operacaoService;
	
	@PostMapping(value = "/despesa/salvar")
	public String salvarDespesa(@Valid Operacao operacao, @RequestParam("file") MultipartFile  file, BindingResult bindingResult) throws IOException {
		
		if (bindingResult.hasErrors()) {
			return "pages/despesa/despesa";
		}
		operacao.setDataOperacao(LocalDateTime.now());
		String fileEncoded = Base64.getEncoder().encodeToString(file.getBytes());
		operacao.setAnexoComprovante(fileEncoded);		
		operacaoService.salvar(operacao);
		return "redirect:/despesas";	
		
	}

}
