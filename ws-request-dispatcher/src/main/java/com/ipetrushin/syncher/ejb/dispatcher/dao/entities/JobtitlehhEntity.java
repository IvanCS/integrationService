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
@javax.persistence.Table(name = "JOBTITLEHH", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitlehhEntity {
    private int jobtitlehhid;
    private String name;
    private Collection<JobtitleEntity> jobtitlesByJobtitlehhid;

    @javax.persistence.Column(name = "JOBTITLEHHID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getJobtitlehhid() {
        return jobtitlehhid;
    }

    public void setJobtitlehhid(int jobtitlehhid) {
        this.jobtitlehhid = jobtitlehhid;
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

        JobtitlehhEntity that = (JobtitlehhEntity) o;

        if (jobtitlehhid != that.jobtitlehhid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = jobtitlehhid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "jobtitlehhByReferenceValueHh")
    public Collection<JobtitleEntity> getJobtitlesByJobtitlehhid() {
        return jobtitlesByJobtitlehhid;
    }

    public void setJobtitlesByJobtitlehhid(Collection<JobtitleEntity> jobtitlesByJobtitlehhid) {
        this.jobtitlesByJobtitlehhid = jobtitlesByJobtitlehhid;
    }
}
