package com.Silva.AppLojaVirtual.services;

import java.util.List;

import com.Silva.AppLojaVirtual.model.Produto;

public interface ProdutoService {
	
	List<Produto> listAll();
	
	Produto getById(String id);
	
	Produto  SaveOrUpdade(Produto produto);
	
	void delete(String id);
	

}
