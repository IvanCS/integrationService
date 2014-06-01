package com.ipetrushin.syncher.webclient.beans;

import com.ipetrushin.syncher.webclient.wsblclient.WSBusinesLogicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import java.util.Arrays;
import java.util.Map;

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

    public String registrate() {
        String userId = null;
        try {

            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();

            WSBusinesLogicService businesLogicService = new WSBusinesLogicService();

            String[] userData = new String[]{getNewLogin(), getNewPassword(), getNewEMailAddress()};
            userId = businesLogicService.getWSBusinesLogicPort().registrate(Arrays.asList(userData));

            sessionMap.put("user_id", userId);
            FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "home.xhtml?faces-redirect=true";
    }
}
