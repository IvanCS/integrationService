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
@javax.persistence.Table(name = "PROFESSION", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionEntity {
    private int professionid;
    private String name;
    private Collection<JobtitleEntity> jobtitlesByProfessionid;
    private ProfessionhhEntity professionhhByReferenceValueHh;
    private ProfessionmonsterEntity professionmonsterByReferenceValueMonster;

    @javax.persistence.Column(name = "PROFESSIONID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getProfessionid() {
        return professionid;
    }

    public void setProfessionid(int professionid) {
        this.professionid = professionid;
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

        if (professionid != entity.professionid) return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "professionByProfession")
    public Collection<JobtitleEntity> getJobtitlesByProfessionid() {
        return jobtitlesByProfessionid;
    }

    public void setJobtitlesByProfessionid(Collection<JobtitleEntity> jobtitlesByProfessionid) {
        this.jobtitlesByProfessionid = jobtitlesByProfessionid;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_HH", referencedColumnName = "PROFESSIONHHID")
    public ProfessionhhEntity getProfessionhhByReferenceValueHh() {
        return professionhhByReferenceValueHh;
    }

    public void setProfessionhhByReferenceValueHh(ProfessionhhEntity professionhhByReferenceValueHh) {
        this.professionhhByReferenceValueHh = professionhhByReferenceValueHh;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_MONSTER", referencedColumnName = "PROFESSIONMONSTERID")
    public ProfessionmonsterEntity getProfessionmonsterByReferenceValueMonster() {
        return professionmonsterByReferenceValueMonster;
    }

    public void setProfessionmonsterByReferenceValueMonster(ProfessionmonsterEntity professionmonsterByReferenceValueMonster) {
        this.professionmonsterByReferenceValueMonster = professionmonsterByReferenceValueMonster;
    }
}
