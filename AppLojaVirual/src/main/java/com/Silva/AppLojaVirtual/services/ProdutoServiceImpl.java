package com.Silva.AppLojaVirtual.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Silva.AppLojaVirtual.model.Produto;
import com.Silva.AppLojaVirtual.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService{
	
	
	private ProdutoRepository produtoRepository;

	@Override
	public List<Produto> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto SaveOrUpdade(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

}
