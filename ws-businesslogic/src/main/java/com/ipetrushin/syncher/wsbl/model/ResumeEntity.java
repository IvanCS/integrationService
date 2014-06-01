package com.ipetrushin.syncher.wsbl.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 12:46
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "RESUME", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ResumeEntity {
    private int resumeId;

    @javax.persistence.Column(name = "RESUME_ID")
    @Id
    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    private int userId;

    @javax.persistence.Column(name = "USER_ID")
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private Date datelastmodified;

    @javax.persistence.Column(name = "DATELASTMODIFIED")
    @Basic
    public Date getDatelastmodified() {
        return datelastmodified;
    }

    public void setDatelastmodified(Date datelastmodified) {
        this.datelastmodified = datelastmodified;
    }

     private String contentdata;

    @javax.persistence.Column(name = "CONTENTDATA")
    @Basic
    public String getContentdata() {
        return contentdata;
    }

    public void setContentdata(String contentdata) {
        this.contentdata = contentdata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResumeEntity that = (ResumeEntity) o;

        if (resumeId != that.resumeId) return false;
        if (userId != that.userId) return false;
        if (contentdata != null ? !contentdata.equals(that.contentdata) : that.contentdata != null) return false;
        if (datelastmodified != null ? !datelastmodified.equals(that.datelastmodified) : that.datelastmodified != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resumeId;
        result = 31 * result + userId;
        result = 31 * result + (datelastmodified != null ? datelastmodified.hashCode() : 0);
        result = 31 * result + (contentdata != null ? contentdata.hashCode() : 0);
        return result;
    }
}
