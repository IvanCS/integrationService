package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/10/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PROFESSIONHH", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionhhEntity {
    private int professionId;
    private String name;
    private Collection<ProfessionEntity> professionsByProfessionId;

    @javax.persistence.Column(name = "PROFESSION_ID")
    @Id
    public int getProfessionId() {
        return professionId;
    }

    public void setProfessionId(int professionId) {
        this.professionId = professionId;
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

        if (professionId != that.professionId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "professionhhByReferenceValueHh")
    public Collection<ProfessionEntity> getProfessionsByProfessionId() {
        return professionsByProfessionId;
    }

    public void setProfessionsByProfessionId(Collection<ProfessionEntity> professionsByProfessionId) {
        this.professionsByProfessionId = professionsByProfessionId;
    }
}
