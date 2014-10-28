package com.camaleao.cardapio.rest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.camaleao.cardapio.entity.Usuario;
import com.camaleao.cardapio.service.UsuarioService;

@Controller	
@RequestMapping("/usuario/")
public class UsuarioRest {

	@Autowired 
	private UsuarioService usuarioSvc;
	
	 @RequestMapping(value = "/getAll", method = RequestMethod.GET)
	  public @ResponseBody List<Usuario> listAll() {
	    return usuarioSvc.getAll();
	  }
	
}
