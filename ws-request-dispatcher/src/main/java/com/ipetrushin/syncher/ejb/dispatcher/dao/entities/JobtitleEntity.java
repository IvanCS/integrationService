package com.ipetrushin.syncher.ejb.dispatcher.dao.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 20.09.13
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "JOBTITLE", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitleEntity {
    private int jobtitleid;
    private String name;
    private Integer profession;
    private Integer referenceValueHh;
    private Integer referenceValueMonster;

    @Column(name = "JOBTITLEID")
    @Id
    public int getJobtitleid() {
        return jobtitleid;
    }

    public void setJobtitleid(int jobtitleid) {
        this.jobtitleid = jobtitleid;
    }

    @Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PROFESSION")
    @Basic
    public Integer getProfession() {
        return profession;
    }

    public void setProfession(Integer profession) {
        this.profession = profession;
    }


    @Column(name = "REFERENCE_VALUE_HH")
    @Basic
    public Integer getReferenceValueHh() {
        return referenceValueHh;
    }

    public void setReferenceValueHh(Integer referenceValueHh) {
        this.referenceValueHh = referenceValueHh;
    }

    @Column(name = "REFERENCE_VALUE_MONSTER")
    @Basic
    public Integer getReferenceValueMonster() {
        return referenceValueMonster;
    }

    public void setReferenceValueMonster(Integer referenceValueMonster) {
        this.referenceValueMonster = referenceValueMonster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobtitleEntity that = (JobtitleEntity) o;

        if (jobtitleid != that.jobtitleid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (profession != null ? !profession.equals(that.profession) : that.profession != null) return false;
        if (referenceValueHh != null ? !referenceValueHh.equals(that.referenceValueHh) : that.referenceValueHh != null)
            return false;
        if (referenceValueMonster != null ? !referenceValueMonster.equals(that.referenceValueMonster) : that.referenceValueMonster != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitleid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (referenceValueHh != null ? referenceValueHh.hashCode() : 0);
        result = 31 * result + (referenceValueMonster != null ? referenceValueMonster.hashCode() : 0);
        return result;
    }
}
