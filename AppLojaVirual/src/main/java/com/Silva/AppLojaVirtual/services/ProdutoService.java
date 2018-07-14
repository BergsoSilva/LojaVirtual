package com.Silva.AppLojaVirtual.services;

import java.util.List;


import com.Silva.AppLojaVirtual.model.Produto;

public interface ProdutoService {
	
	List<Produto> listAll();
	
	Produto getById(String id);
	
	Produto save(Produto produto);
	
	Produto update(Produto produto);
	
	void delete(String id);
	

}
