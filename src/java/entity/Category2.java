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
    @NamedQuery(name = "Category2.findAll", query = "SELECT c FROM Category2 c"),
    @NamedQuery(name = "Category2.findById", query = "SELECT c FROM Category2 c WHERE c.id = :id"),
    @NamedQuery(name = "Category2.findByTen", query = "SELECT c FROM Category2 c WHERE c.ten = :ten"),
    @NamedQuery(name = "Category2.findByMota", query = "SELECT c FROM Category2 c WHERE c.mota = :mota"),
    @NamedQuery(name = "Category2.findByXoa", query = "SELECT c FROM Category2 c WHERE c.xoa = :xoa")})
public class Category2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private String ten;
    private String mota;
    private BigInteger xoa;

    public Category2() {
    }

    public Category2(Integer id) {
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
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
        if (!(object instanceof Category2)) {
            return false;
        }
        Category2 other = (Category2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Category2[ id=" + id + " ]";
    }
    
}
