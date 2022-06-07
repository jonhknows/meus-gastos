package br.com.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.start.model.Subcategoria;
import br.com.start.repository.SubcategoriaRepository;
import br.com.start.service.SubcategoriaService;

@Service
public class SubcategoriaImpl implements SubcategoriaService{

	@Autowired
	private SubcategoriaRepository subcategoriaRepository;
	
	@Override
	public List<Subcategoria> buscarTodas() {
		return subcategoriaRepository.findAll();
	}

	
}
