package com.camaleao.cardapio.rest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.camaleao.cardapio.entity.Produto;
import com.camaleao.cardapio.service.ProdutoService;

@Controller
@RequestMapping("/produto/")
public class ProdutoRest {

	@Autowired
	private ProdutoService produtoSvc;

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Produto> listAll() {
		return produtoSvc.getAll();
	}
	
	@RequestMapping(value = "/getByName", method = RequestMethod.GET)
	public @ResponseBody List<Produto> getByName(@RequestParam String nome) {
		return produtoSvc.getByName(nome);
	}
	
		
}
