/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Tadeu
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "TipoCachaca.FindAll", query = "SELECT c FROM TipoCachaca c"),
    @NamedQuery(name = "TipoCachaca.FindByCodigo", query = "SELECT c FROM TipoCachaca c WHERE c.codTipo = :codigo"),
    @NamedQuery(name = "TipoCachaca.FindByDescricao", query = "SELECT c FROM TipoCachaca c WHERE c.descricao = :descricao")
})
public class TipoCachaca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODTIPO")
    private Integer codTipo;
    @Column(name = "DESCRICAO", unique = true, nullable = false)
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Integer codTipo) {
        this.codTipo = codTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipo != null ? codTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the codCachaca fields are not set
        if (!(object instanceof TipoCachaca)) {
            return false;
        }
        TipoCachaca other = (TipoCachaca) object;
        if ((this.codTipo == null && other.codTipo != null) || (this.codTipo != null && !this.codTipo.equals(other.codTipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cachaca[ id=" + codTipo + " ]";
    }

}
