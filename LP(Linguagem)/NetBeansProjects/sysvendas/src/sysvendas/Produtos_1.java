/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sysvendas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jefer
 */
@Entity
@Table(name = "produtos", catalog = "sysvendas", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos_1.findAll", query = "SELECT p FROM Produtos_1 p")
    , @NamedQuery(name = "Produtos_1.findById", query = "SELECT p FROM Produtos_1 p WHERE p.id = :id")
    , @NamedQuery(name = "Produtos_1.findByDesri\u00e7ao", query = "SELECT p FROM Produtos_1 p WHERE p.desri\u00e7ao = :desri\u00e7ao")
    , @NamedQuery(name = "Produtos_1.findByFornecedor", query = "SELECT p FROM Produtos_1 p WHERE p.fornecedor = :fornecedor")
    , @NamedQuery(name = "Produtos_1.findByValor", query = "SELECT p FROM Produtos_1 p WHERE p.valor = :valor")
    , @NamedQuery(name = "Produtos_1.findByValorfinal", query = "SELECT p FROM Produtos_1 p WHERE p.valorfinal = :valorfinal")
    , @NamedQuery(name = "Produtos_1.findByQtdestoque", query = "SELECT p FROM Produtos_1 p WHERE p.qtdestoque = :qtdestoque")
    , @NamedQuery(name = "Produtos_1.findByMarca", query = "SELECT p FROM Produtos_1 p WHERE p.marca = :marca")
    , @NamedQuery(name = "Produtos_1.findByCategoria", query = "SELECT p FROM Produtos_1 p WHERE p.categoria = :categoria")})
public class Produtos_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "desri\u00e7ao")
    private String desriçao;
    @Basic(optional = false)
    @Column(name = "fornecedor")
    private int fornecedor;
    @Basic(optional = false)
    @Column(name = "valor")
    private float valor;
    @Basic(optional = false)
    @Column(name = "valorfinal")
    private float valorfinal;
    @Basic(optional = false)
    @Column(name = "qtdestoque")
    private int qtdestoque;
    @Basic(optional = false)
    @Column(name = "marca")
    private String marca;
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;

    public Produtos_1() {
    }

    public Produtos_1(Integer id) {
        this.id = id;
    }

    public Produtos_1(Integer id, String desriçao, int fornecedor, float valor, float valorfinal, int qtdestoque, String marca, String categoria) {
        this.id = id;
        this.desriçao = desriçao;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.valorfinal = valorfinal;
        this.qtdestoque = qtdestoque;
        this.marca = marca;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDesriçao() {
        return desriçao;
    }

    public void setDesriçao(String desriçao) {
        String oldDesriçao = this.desriçao;
        this.desriçao = desriçao;
        changeSupport.firePropertyChange("desri\u00e7ao", oldDesriçao, desriçao);
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        int oldFornecedor = this.fornecedor;
        this.fornecedor = fornecedor;
        changeSupport.firePropertyChange("fornecedor", oldFornecedor, fornecedor);
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        float oldValor = this.valor;
        this.valor = valor;
        changeSupport.firePropertyChange("valor", oldValor, valor);
    }

    public float getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(float valorfinal) {
        float oldValorfinal = this.valorfinal;
        this.valorfinal = valorfinal;
        changeSupport.firePropertyChange("valorfinal", oldValorfinal, valorfinal);
    }

    public int getQtdestoque() {
        return qtdestoque;
    }

    public void setQtdestoque(int qtdestoque) {
        int oldQtdestoque = this.qtdestoque;
        this.qtdestoque = qtdestoque;
        changeSupport.firePropertyChange("qtdestoque", oldQtdestoque, qtdestoque);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        changeSupport.firePropertyChange("marca", oldMarca, marca);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        String oldCategoria = this.categoria;
        this.categoria = categoria;
        changeSupport.firePropertyChange("categoria", oldCategoria, categoria);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos_1)) {
            return false;
        }
        Produtos_1 other = (Produtos_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sysvendas.Produtos_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
