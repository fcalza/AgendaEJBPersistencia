/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author martin
 */
@Stateless
public class AgendaEJB implements AgendaEJBLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void inserir(Contato contato){
        this.em.persist(contato);
    }
    
    @Override
    public Contato buscar(String nome){
        return this.em.find(Contato.class, nome);
    }
    
    @Override 
    public void modificar(Contato contato){
        this.em.merge(contato);
    }
}
