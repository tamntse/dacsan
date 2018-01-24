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
    @NamedQuery(name = "Donhang.findAll", query = "SELECT d FROM Donhang d"),
    @NamedQuery(name = "Donhang.findById", query = "SELECT d FROM Donhang d WHERE d.id = :id"),
    @NamedQuery(name = "Donhang.findByTen", query = "SELECT d FROM Donhang d WHERE d.ten = :ten"),
    @NamedQuery(name = "Donhang.findBySodienthoai", query = "SELECT d FROM Donhang d WHERE d.sodienthoai = :sodienthoai"),
    @NamedQuery(name = "Donhang.findByEmail", query = "SELECT d FROM Donhang d WHERE d.email = :email"),
    @NamedQuery(name = "Donhang.findBySanphamId", query = "SELECT d FROM Donhang d WHERE d.sanphamId = :sanphamId"),
    @NamedQuery(name = "Donhang.findBySoluong", query = "SELECT d FROM Donhang d WHERE d.soluong = :soluong"),
    @NamedQuery(name = "Donhang.findByGia", query = "SELECT d FROM Donhang d WHERE d.gia = :gia"),
    @NamedQuery(name = "Donhang.findByDescription", query = "SELECT d FROM Donhang d WHERE d.description = :description"),
    @NamedQuery(name = "Donhang.findByResolved", query = "SELECT d FROM Donhang d WHERE d.resolved = :resolved"),
    @NamedQuery(name = "Donhang.findByDateCreate", query = "SELECT d FROM Donhang d WHERE d.dateCreate = :dateCreate")})
public class Donhang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private String ten;
    private Integer sodienthoai;
    private String email;
    private Integer sanphamId;
    private Integer soluong;
    private Integer gia;
    private Integer description;
    private BigInteger resolved;
    private String dateCreate;

    public Donhang() {
    }

    public Donhang(Integer id) {
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

    public Integer getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(Integer sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSanphamId() {
        return sanphamId;
    }

    public void setSanphamId(Integer sanphamId) {
        this.sanphamId = sanphamId;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public BigInteger getResolved() {
        return resolved;
    }

    public void setResolved(BigInteger resolved) {
        this.resolved = resolved;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
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
        if (!(object instanceof Donhang)) {
            return false;
        }
        Donhang other = (Donhang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Donhang[ id=" + id + " ]";
    }
    
}
