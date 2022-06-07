package br.com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.start.model.Operacao;
import br.com.start.model.enums.Fonte;
import br.com.start.model.enums.StatusPagamento;
import br.com.start.service.CategoriaService;
import br.com.start.service.SubcategoriaService;

@Controller
@RequestMapping(value = "/despesas")
public class DespesaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@Autowired
	private SubcategoriaService subcategoriaService;
	
	@GetMapping
	public ModelAndView homeDespesa() {
		ModelAndView mv = new ModelAndView("pages/despesa/despesa");
		mv.addObject("operacao", new Operacao());
		mv.addObject("categorias", categoriaService.buscarTodas());
		mv.addObject("subcategorias", subcategoriaService.buscarTodas());
		mv.addObject("fontes", Fonte.values());
		return mv;
	}

}
