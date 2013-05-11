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
@javax.persistence.Table(name = "PROFESSIONMONSTER", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionmonsterEntity {
    private int professionmonsterid;
    private String name;
    private Collection<ProfessionEntity> professionsByProfessionmonsterid;

    @javax.persistence.Column(name = "PROFESSIONMONSTERID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getProfessionmonsterid() {
        return professionmonsterid;
    }

    public void setProfessionmonsterid(int professionmonsterid) {
        this.professionmonsterid = professionmonsterid;
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

        ProfessionmonsterEntity that = (ProfessionmonsterEntity) o;

        if (professionmonsterid != that.professionmonsterid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionmonsterid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "professionmonsterByReferenceValueMonster")
    public Collection<ProfessionEntity> getProfessionsByProfessionmonsterid() {
        return professionsByProfessionmonsterid;
    }

    public void setProfessionsByProfessionmonsterid(Collection<ProfessionEntity> professionsByProfessionmonsterid) {
        this.professionsByProfessionmonsterid = professionsByProfessionmonsterid;
    }
}
