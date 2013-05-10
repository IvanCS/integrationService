package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/10/13
 * Time: 12:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "JOBTITLE", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitleEntity {
    private int jobtitleId;
    private String name;
    private Integer referenceValueMonster;
    private Integer referenceValueHh;
    private ProfessionEntity professionByProfession;
    private JobtitlehhEntity jobtitlehhByReferenceValueMonster;
    private JobtitlemonsterEntity jobtitlemonsterByReferenceValueHh;

    @Column(name = "JOBTITLE_ID")
    @Id
    public int getJobtitleId() {
        return jobtitleId;
    }

    public void setJobtitleId(int jobtitleId) {
        this.jobtitleId = jobtitleId;
    }

    @Column(name = "NAME")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "REFERENCE_VALUE_MONSTER")
    @Basic
    public Integer getReferenceValueMonster() {
        return referenceValueMonster;
    }

    public void setReferenceValueMonster(Integer referenceValueMonster) {
        this.referenceValueMonster = referenceValueMonster;
    }

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

        JobtitleEntity that = (JobtitleEntity) o;

        if (jobtitleId != that.jobtitleId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (referenceValueHh != null ? !referenceValueHh.equals(that.referenceValueHh) : that.referenceValueHh != null)
            return false;
        if (referenceValueMonster != null ? !referenceValueMonster.equals(that.referenceValueMonster) : that.referenceValueMonster != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitleId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (referenceValueMonster != null ? referenceValueMonster.hashCode() : 0);
        result = 31 * result + (referenceValueHh != null ? referenceValueHh.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PROFESSION", referencedColumnName = "PROFESSION_ID")
    public ProfessionEntity getProfessionByProfession() {
        return professionByProfession;
    }

    public void setProfessionByProfession(ProfessionEntity professionByProfession) {
        this.professionByProfession = professionByProfession;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_MONSTER", referencedColumnName = "JOBTITLE_ID")
    public JobtitlehhEntity getJobtitlehhByReferenceValueMonster() {
        return jobtitlehhByReferenceValueMonster;
    }

    public void setJobtitlehhByReferenceValueMonster(JobtitlehhEntity jobtitlehhByReferenceValueMonster) {
        this.jobtitlehhByReferenceValueMonster = jobtitlehhByReferenceValueMonster;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_VALUE_HH", referencedColumnName = "JOBTITLE_ID")
    public JobtitlemonsterEntity getJobtitlemonsterByReferenceValueHh() {
        return jobtitlemonsterByReferenceValueHh;
    }

    public void setJobtitlemonsterByReferenceValueHh(JobtitlemonsterEntity jobtitlemonsterByReferenceValueHh) {
        this.jobtitlemonsterByReferenceValueHh = jobtitlemonsterByReferenceValueHh;
    }
}
