package com.camaleao.cardapio.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camaleao.cardapio.entity.Categoria;


@Service
public class CategoriaService {
    @PersistenceContext
    private EntityManager em;
	
	
    @Transactional
    public List<Categoria> getAll(){
    	return em.createQuery("SELECT u FROM Categoria u", Categoria.class).getResultList();
    }
}
