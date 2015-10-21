/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 *
 * @author Tadeu
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cachaca.FindAll", query = "SELECT c FROM Cachaca c"),
    @NamedQuery(name = "Cachaca.FindByCodigo", query = "SELECT c FROM Cachaca c WHERE c.codCachaca = :codigo")
})
public class Cachaca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCACHACA")
    private Integer codCachaca;
    @Column(name = "NOME", nullable = false)
    private String nome;
    @Column(name = "REFERENCIA", unique = true, nullable = false)
    private String referencia;
    @Column(name = "MADEIRA", nullable = true)
    private String madeira;
    @Column(name = "GRADUACAO", nullable = false)
    private int graduacao;
    @Column(name = "ORIGEM", nullable = false)
    private String origem;
    @Column(name = "PRECO", precision = 6, scale = 2, nullable = false)
    private double preco;
    @Column(name = "ENVELHECIMENTO", nullable = false)
    private String envelhecimento;
    @Lob
    @Column(name = "FOTO", unique = true, nullable=false, columnDefinition="mediumblob")
    private byte[] foto;
    @Column(name = "DESCRICAO", columnDefinition = "text", nullable = true)
    private String descricao;
    @JoinColumn(name = "CODTIPO", referencedColumnName = "CODTIPO")
    @OneToOne
    private TipoCachaca codTipo;

    public Integer getCodCachaca() {
        return codCachaca;
    }

    public void setCodCachaca(Integer codCachaca) {
        this.codCachaca = codCachaca;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public int getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(int graduacao) {
        this.graduacao = graduacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEnvelhecimento() {
        return envelhecimento;
    }

    public void setEnvelhecimento(String envelhecimento) {
        this.envelhecimento = envelhecimento;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoCachaca getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(TipoCachaca codTipo) {
        this.codTipo = codTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCachaca != null ? codCachaca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the codCachaca fields are not set
        if (!(object instanceof Cachaca)) {
            return false;
        }
        Cachaca other = (Cachaca) object;
        if ((this.codCachaca == null && other.codCachaca != null) || (this.codCachaca != null && !this.codCachaca.equals(other.codCachaca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cachaca[ id=" + codCachaca + " ]";
    }

}
