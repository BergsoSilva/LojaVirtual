package com.Silva.AppLojaVirtual.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.Silva.AppLojaVirtual.model.Produto;

public interface ProdutoRepository  extends MongoRepository<Produto, String>{

}
