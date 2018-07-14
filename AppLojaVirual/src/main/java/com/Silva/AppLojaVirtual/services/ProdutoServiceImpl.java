package com.Silva.AppLojaVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Silva.AppLojaVirtual.model.Produto;
import com.Silva.AppLojaVirtual.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	private ProdutoRepository produtoRepository;


	@Override
	public List<Produto> listAll() {
		return this.produtoRepository.findAll();
	}

	@Override
	public Produto getById(String id) {
		return produtoRepository.findById(id).orElse(null);
	}


	@Override
	public void delete(String id) {
		produtoRepository.deleteById(id);
		
	}

	@Override
	public Produto save(Produto produto) {
		 return this.produtoRepository.save(produto);
	    
	}

	@Override
	public Produto update(Produto produto) {
		 return this.produtoRepository.save(produto);
	}
	
	

}
