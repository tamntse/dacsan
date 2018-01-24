/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(catalog = "dacsan", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Category1.findAll", query = "SELECT c FROM Category1 c"),
    @NamedQuery(name = "Category1.findById", query = "SELECT c FROM Category1 c WHERE c.id = :id"),
    @NamedQuery(name = "Category1.findByTen", query = "SELECT c FROM Category1 c WHERE c.ten = :ten"),
    @NamedQuery(name = "Category1.findByMotal", query = "SELECT c FROM Category1 c WHERE c.motal = :motal"),
    @NamedQuery(name = "Category1.findByXoa", query = "SELECT c FROM Category1 c WHERE c.xoa = :xoa")})
public class Category1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private String ten;
    private String motal;
    private BigInteger xoa;

    public Category1() {
    }

    public Category1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMotal() {
        return motal;
    }

    public void setMotal(String motal) {
        this.motal = motal;
    }

    public BigInteger getXoa() {
        return xoa;
    }

    public void setXoa(BigInteger xoa) {
        this.xoa = xoa;
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
        if (!(object instanceof Category1)) {
            return false;
        }
        Category1 other = (Category1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Category1[ id=" + id + " ]";
    }
    
}
