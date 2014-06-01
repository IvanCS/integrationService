package com.ipetrushin.syncher.request.mapping;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public class Resume implements Serializable{

    private int resumeId;
    private int userId;
    private Date datelastmodified;
    private String contentdata;

    public int getResumeId() {
        return resumeId;
    }

    public void setResumeId(int resumeId) {
        this.resumeId = resumeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getDatelastmodified() {
        return datelastmodified;
    }

    public void setDatelastmodified(Date datelastmodified) {
        this.datelastmodified = datelastmodified;
    }

    public String getContentdata() {
        return contentdata;
    }

    public void setContentdata(String contentdata) {
        this.contentdata = contentdata;
    }
}
