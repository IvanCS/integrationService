package com.ipetrushin.syncher.webclient.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 11.05.14
 * Time: 21:44
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "registrateMB", eager = false)
@RequestScoped
public class RegistrationMBean {
    private String newLogin;
    private String newPassword;
    private String newEMailAddress;

    public String getNewLogin() {
        return newLogin;
    }

    public void setNewLogin(String newLogin) {
        this.newLogin = newLogin;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewEMailAddress() {
        return newEMailAddress;
    }

    public void setNewEMailAddress(String newEMailAddress) {
        this.newEMailAddress = newEMailAddress;
    }

    public String registrate(){
        return "home.xhtml?faces-redirect=true&amp;includeViewParams=true";
    }
}
