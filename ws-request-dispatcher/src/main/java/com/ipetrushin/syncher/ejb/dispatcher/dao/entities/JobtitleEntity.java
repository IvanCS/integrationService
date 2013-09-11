package com.ipetrushin.syncher.ejb.dispatcher.dao.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "JOBTITLE", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitleEntity {
    private int jobtitleid;
    private String name;
    private JobtitlehhEntity jobtitlehhByReferenceValueHh;
    private JobtitlemonsterEntity jobtitlemonsterByReferenceValueMonster;
    private ProfessionEntity professionByProfession;

    @javax.persistence.Column(name = "JOBTITLEID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getJobtitleid() {
        return jobtitleid;
    }

    public void setJobtitleid(int jobtitleid) {
        this.jobtitleid = jobtitleid;
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

        if (jobtitleid != that.jobtitleid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitleid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "REFERENCE_VALUE_HH", referencedColumnName = "JOBTITLEHHID")
    public JobtitlehhEntity getJobtitlehhByReferenceValueHh() {
        return jobtitlehhByReferenceValueHh;
    }

    public void setJobtitlehhByReferenceValueHh(JobtitlehhEntity jobtitlehhByReferenceValueHh) {
        this.jobtitlehhByReferenceValueHh = jobtitlehhByReferenceValueHh;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "REFERENCE_VALUE_MONSTER", referencedColumnName = "JOBTITLEMONSTERID")
    public JobtitlemonsterEntity getJobtitlemonsterByReferenceValueMonster() {
        return jobtitlemonsterByReferenceValueMonster;
    }

    public void setJobtitlemonsterByReferenceValueMonster(JobtitlemonsterEntity jobtitlemonsterByReferenceValueMonster) {
        this.jobtitlemonsterByReferenceValueMonster = jobtitlemonsterByReferenceValueMonster;
    }

    @ManyToOne
    @javax.persistence.JoinColumn(name = "PROFESSION", referencedColumnName = "PROFESSIONID")
    public ProfessionEntity getProfessionByProfession() {
        return professionByProfession;
    }

    public void setProfessionByProfession(ProfessionEntity professionByProfession) {
        this.professionByProfession = professionByProfession;
    }
}
