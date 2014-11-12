package com.camaleao.cardapio.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camaleao.cardapio.entity.Usuario;

@Service
public class UsuarioService {
    @PersistenceContext
    private EntityManager em;
	
	
    @Transactional
    public List<Usuario> getAll(){
    	return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

    @Transactional
	public void add(Usuario usuario) {
    	 em.persist(usuario);
	}
	 
}

