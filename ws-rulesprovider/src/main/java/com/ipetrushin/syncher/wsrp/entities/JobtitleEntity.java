package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/10/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "JOBTITLE", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitleEntity {
    private int jobtitleId;
    private String name;
    private JobtitlehhEntity jobtitlehhByReferenceValueMonster;
    private JobtitlemonsterEntity jobtitlemonsterByReferenceValueHh;
    private ProfessionEntity professionByProfession;

    @javax.persistence.Column(name = "JOBTITLE_ID")
    @Id
    public int getJobtitleId() {
        return jobtitleId;
    }

    public void setJobtitleId(int jobtitleId) {
        this.jobtitleId = jobtitleId;
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

        JobtitleEntity that = (JobtitleEntity) o;

        if (jobtitleId != that.jobtitleId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitleId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "REFERENCE_VALUE_MONSTER", referencedColumnName = "JOBTITLE_ID")
    public JobtitlehhEntity getJobtitlehhByReferenceValueMonster() {
        return jobtitlehhByReferenceValueMonster;
    }

    public void setJobtitlehhByReferenceValueMonster(JobtitlehhEntity jobtitlehhByReferenceValueMonster) {
        this.jobtitlehhByReferenceValueMonster = jobtitlehhByReferenceValueMonster;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "REFERENCE_VALUE_HH", referencedColumnName = "JOBTITLE_ID")
    public JobtitlemonsterEntity getJobtitlemonsterByReferenceValueHh() {
        return jobtitlemonsterByReferenceValueHh;
    }

    public void setJobtitlemonsterByReferenceValueHh(JobtitlemonsterEntity jobtitlemonsterByReferenceValueHh) {
        this.jobtitlemonsterByReferenceValueHh = jobtitlemonsterByReferenceValueHh;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "PROFESSION", referencedColumnName = "PROFESSION_ID")
    public ProfessionEntity getProfessionByProfession() {
        return professionByProfession;
    }

    public void setProfessionByProfession(ProfessionEntity professionByProfession) {
        this.professionByProfession = professionByProfession;
    }
}
