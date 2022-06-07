package br.com.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.start.model.Categoria;
import br.com.start.repository.CategoriaRepository;
import br.com.start.service.CategoriaService;

@Service
public class CategoriaImpl implements CategoriaService{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> buscarTodas() {
		return categoriaRepository.findAll();
	}

}
