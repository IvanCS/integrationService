package com.ipetrushin.syncher.wsrp.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/10/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "JOBTITLEMONSTER", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class JobtitlemonsterEntity {
    private int jobtitleId;
    private String name;
    private Collection<JobtitleEntity> jobtitlesByJobtitleId;

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

        JobtitlemonsterEntity that = (JobtitlemonsterEntity) o;

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

    @OneToMany(mappedBy = "jobtitlemonsterByReferenceValueHh")
    public Collection<JobtitleEntity> getJobtitlesByJobtitleId() {
        return jobtitlesByJobtitleId;
    }

    public void setJobtitlesByJobtitleId(Collection<JobtitleEntity> jobtitlesByJobtitleId) {
        this.jobtitlesByJobtitleId = jobtitlesByJobtitleId;
    }
}
