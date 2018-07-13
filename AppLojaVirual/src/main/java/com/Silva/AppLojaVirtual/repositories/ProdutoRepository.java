package com.Silva.AppLojaVirtual.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Silva.AppLojaVirtual.model.Produto;

public interface ProdutoRepository  extends MongoRepository<Produto, String>{

}
