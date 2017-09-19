/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import javax.ejb.Local;

/**
 *
 * @author martin
 */
@Local
public interface AgendaEJBLocal {
    public void inserir(Contato contato);
    public Contato buscar(String nome);
    public void modificar(Contato contato);
}
