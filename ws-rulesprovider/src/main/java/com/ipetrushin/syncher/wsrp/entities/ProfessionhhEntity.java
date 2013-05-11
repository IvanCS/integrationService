package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PROFESSIONHH", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionhhEntity {
    private int professionhhid;
    private String name;
    private Collection<ProfessionEntity> professionsByProfessionhhid;

    @javax.persistence.Column(name = "PROFESSIONHHID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getProfessionhhid() {
        return professionhhid;
    }

    public void setProfessionhhid(int professionhhid) {
        this.professionhhid = professionhhid;
    }

    @javax.persistence.Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfessionhhEntity that = (ProfessionhhEntity) o;

        if (professionhhid != that.professionhhid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionhhid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "professionhhByReferenceValueHh")
    public Collection<ProfessionEntity> getProfessionsByProfessionhhid() {
        return professionsByProfessionhhid;
    }

    public void setProfessionsByProfessionhhid(Collection<ProfessionEntity> professionsByProfessionhhid) {
        this.professionsByProfessionhhid = professionsByProfessionhhid;
    }
}
