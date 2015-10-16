/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cachaca;
import Util.Classes.Conexao;
import java.util.List;

/**
 *
 * @author Tadeu
 */
public class CachacaDAO extends Conexao {

    public void save(Cachaca cachaca) {
        em.getTransaction().begin();
        em.merge(cachaca);
        em.getTransaction().commit();
    }

    public void remove(Cachaca cachaca) {
        em.getTransaction().begin();
        em.remove(cachaca);
        em.getTransaction().commit();
    }

    public Cachaca find(int codigo) {
        em.getTransaction().begin();
        query = em.createNamedQuery("Cachaca.FindByCodigo").setParameter("codigo", codigo);
        em.getTransaction().commit();
        return (Cachaca) query.getSingleResult();
    }

    public List<Cachaca> list() {
        em.getTransaction().begin();
        query = em.createNamedQuery("Cachaca.FindAll");
        em.getTransaction().commit();
        return query.getResultList();
    }
}
