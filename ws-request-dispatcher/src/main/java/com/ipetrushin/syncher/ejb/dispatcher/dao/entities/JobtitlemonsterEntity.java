package com.ipetrushin.syncher.ejb.dispatcher.dao.entities;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "JOBTITLEMONSTER", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitlemonsterEntity {
    private int jobtitlemonsterid;
    private String name;
    private Collection<JobtitleEntity> jobtitlesByJobtitlemonsterid;

    @javax.persistence.Column(name = "JOBTITLEMONSTERID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getJobtitlemonsterid() {
        return jobtitlemonsterid;
    }

    public void setJobtitlemonsterid(int jobtitlemonsterid) {
        this.jobtitlemonsterid = jobtitlemonsterid;
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

        JobtitlemonsterEntity that = (JobtitlemonsterEntity) o;

        if (jobtitlemonsterid != that.jobtitlemonsterid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitlemonsterid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "jobtitlemonsterByReferenceValueMonster")
    public Collection<JobtitleEntity> getJobtitlesByJobtitlemonsterid() {
        return jobtitlesByJobtitlemonsterid;
    }

    public void setJobtitlesByJobtitlemonsterid(Collection<JobtitleEntity> jobtitlesByJobtitlemonsterid) {
        this.jobtitlesByJobtitlemonsterid = jobtitlesByJobtitlemonsterid;
    }
}
