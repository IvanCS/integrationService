package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/10/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "PROFESSION", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionEntity {
    private int professionId;
    private String name;
    private Collection<JobtitleEntity> jobtitlesByProfessionId;
    private ProfessionhhEntity professionhhByReferenceValueHh;
    private ProfessionmonsterEntity professionmonsterByReferenceValueMonster;

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

        ProfessionEntity entity = (ProfessionEntity) o;

        if (professionId != entity.professionId) return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "professionByProfession")
    public Collection<JobtitleEntity> getJobtitlesByProfessionId() {
        return jobtitlesByProfessionId;
    }

    public void setJobtitlesByProfessionId(Collection<JobtitleEntity> jobtitlesByProfessionId) {
        this.jobtitlesByProfessionId = jobtitlesByProfessionId;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_HH", referencedColumnName = "PROFESSION_ID")
    public ProfessionhhEntity getProfessionhhByReferenceValueHh() {
        return professionhhByReferenceValueHh;
    }

    public void setProfessionhhByReferenceValueHh(ProfessionhhEntity professionhhByReferenceValueHh) {
        this.professionhhByReferenceValueHh = professionhhByReferenceValueHh;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_MONSTER", referencedColumnName = "PROFESSION_ID")
    public ProfessionmonsterEntity getProfessionmonsterByReferenceValueMonster() {
        return professionmonsterByReferenceValueMonster;
    }

    public void setProfessionmonsterByReferenceValueMonster(ProfessionmonsterEntity professionmonsterByReferenceValueMonster) {
        this.professionmonsterByReferenceValueMonster = professionmonsterByReferenceValueMonster;
    }
}
