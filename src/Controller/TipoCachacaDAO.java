/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.TipoCachaca;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class TipoCachacaDAO extends Conexao {

    public void save(TipoCachaca tipo) {
        em.getTransaction().begin();
        em.merge(tipo);
        em.getTransaction().commit();
    }

    public void remove(TipoCachaca cachaca) {
        em.getTransaction().begin();
        em.remove(cachaca);
        em.getTransaction().commit();
    }

    public TipoCachaca find(String tipo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("TipoCachaca.FindByDescricao").setParameter("descricao", tipo);
        em.getTransaction().commit();
        return (TipoCachaca) query.getSingleResult();
    }

    public List<TipoCachaca> list() {
        em.getTransaction().begin();
        query = em.createNamedQuery("TipoCachaca.FindAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
}
