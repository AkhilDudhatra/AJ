/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "stud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stud.findAll", query = "SELECT s FROM Stud s")
    , @NamedQuery(name = "Stud.findById", query = "SELECT s FROM Stud s WHERE s.id = :id")
    , @NamedQuery(name = "Stud.findByName", query = "SELECT s FROM Stud s WHERE s.name = :name")
    , @NamedQuery(name = "Stud.findByEmail", query = "SELECT s FROM Stud s WHERE s.email = :email")
    , @NamedQuery(name = "Stud.findByPassword", query = "SELECT s FROM Stud s WHERE s.password = :password")
    , @NamedQuery(name = "Stud.findByGender", query = "SELECT s FROM Stud s WHERE s.gender = :gender")
    , @NamedQuery(name = "Stud.findByCountry", query = "SELECT s FROM Stud s WHERE s.country = :country")})
public class Stud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "country")
    private String country;

    public Stud() {
    }

    public Stud(Integer id) {
        this.id = id;
    }

    public Stud(Integer id, String name, String email, String password, String gender, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
        if (!(object instanceof Stud)) {
            return false;
        }
        Stud other = (Stud) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Stud[ id=" + id + " ]";
    }
    
}
