package com.camaleao.cardapio.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.camaleao.cardapio.entity.Produto;


@Service
public class ProdutoService {
	
    @PersistenceContext
    private EntityManager em;
	
    @Transactional
    public List<Produto> getAll(){
    	return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
    }
    
    @SuppressWarnings("unchecked")
	@Transactional
    public List<Produto> getByName(String nome){
    	Query q = em.createQuery("SELECT p FROM Produto p WHERE p.nome like :nome", Produto.class);
    	q.setParameter("nome", "%"+nome+"%");
    	return q.getResultList();
    }
    
    @SuppressWarnings("unchecked")
	@Transactional
    public List<Produto> getByDescricao(String desc){
    	Query q = em.createQuery("SELECT p FROM Produto p WHERE p.descricao like :desc", Produto.class);
    	q.setParameter("desc", "%"+desc+"%");
    	return q.getResultList();
    }
}
