package com.Silva.AppLojaVirtual.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Silva.AppLojaVirtual.model.Produto;
import com.Silva.AppLojaVirtual.responses.Response;
import com.Silva.AppLojaVirtual.services.ProdutoService;

@RestController
@RequestMapping("/app/produto")
@CrossOrigin(origins="*")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<Response<List<Produto>>> listaProduto(){
		return ResponseEntity.ok( new Response<>(this.produtoService.listAll()));
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<Response<Produto>> listarPorId(@PathVariable(name= "id") String id){
		
		return ResponseEntity.ok(new Response<Produto>(this.produtoService.getById(id)));
	}
	
	@PostMapping(value="/novo")
	public ResponseEntity<Response<Produto>> adicionar( @RequestBody @Valid  Produto produto, BindingResult result){
		
		if(result.hasErrors()){
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro-> erros.add(erro.getDefaultMessage()));
			
			return ResponseEntity.badRequest().body(new Response<Produto>(erros));
		}
		
		return ResponseEntity.ok( new Response<Produto>(this.produtoService.save(produto)));
	}
	
	@PostMapping(path="/{id}")
	public ResponseEntity<Response<Produto>> atualizar(@PathVariable(name= "id") String id,@Valid @RequestBody Produto produto, BindingResult result){
		
		if(result.hasErrors()){
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro-> erros.add(erro.getDefaultMessage()));
			
			return ResponseEntity.badRequest().body(new Response<Produto>(erros));
		}
		
		produto.setId(id);
		return ResponseEntity.ok(new Response<Produto>(this.produtoService.update(produto)));
	}
	
	@DeleteMapping(path= "/{id}")
	public ResponseEntity< Response<Boolean>> remover(@PathVariable(name="id") String id){
		this.produtoService.delete(id);
		
		return ResponseEntity.ok(new Response<Boolean>(true));
	}
	
	
	
	
}
