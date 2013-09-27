package com.ipetrushin.syncher.ejb.dispatcher.dao.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 20.09.13
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "PROFESSION", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionEntity {
    private int professionid;

    @Column(name = "PROFESSIONID")
    @Id
    public int getProfessionid() {
        return professionid;
    }

    public void setProfessionid(int professionid) {
        this.professionid = professionid;
    }

    private String name;

    @Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer referenceValueMonster;

    @Column(name = "REFERENCE_VALUE_MONSTER")
    @Basic
    public Integer getReferenceValueMonster() {
        return referenceValueMonster;
    }

    public void setReferenceValueMonster(Integer referenceValueMonster) {
        this.referenceValueMonster = referenceValueMonster;
    }

    private Integer referenceValueHh;

    @Column(name = "REFERENCE_VALUE_HH")
    @Basic
    public Integer getReferenceValueHh() {
        return referenceValueHh;
    }

    public void setReferenceValueHh(Integer referenceValueHh) {
        this.referenceValueHh = referenceValueHh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfessionEntity that = (ProfessionEntity) o;

        if (professionid != that.professionid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (referenceValueHh != null ? !referenceValueHh.equals(that.referenceValueHh) : that.referenceValueHh != null)
            return false;
        if (referenceValueMonster != null ? !referenceValueMonster.equals(that.referenceValueMonster) : that.referenceValueMonster != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (referenceValueMonster != null ? referenceValueMonster.hashCode() : 0);
        result = 31 * result + (referenceValueHh != null ? referenceValueHh.hashCode() : 0);
        return result;
    }
}
