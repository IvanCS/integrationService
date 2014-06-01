package com.ipetrushin.syncher.webclient.beans;

import com.ipetrushin.syncher.webclient.wsblclient.WSBusinesLogicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 14.03.14
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "authorizeMB", eager = true)
@ViewScoped
public class AuthorizationMBean implements Serializable {

    private static final long serialVersionUID = 1L;
    Integer userNumber;
    String response;
    private String login;
    private String password;

    public AuthorizationMBean() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void authorize() {
        String userId = null;
        try {

            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> sessionMap = externalContext.getSessionMap();

            WSBusinesLogicService businesLogicService = new WSBusinesLogicService();
            userId = businesLogicService.getWSBusinesLogicPort().authorize(getLogin(), getPassword());

            sessionMap.put("user_id", userId);
            FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getResponse() {
        if ((userNumber != null)) {

            //invalidate user session
            FacesContext context = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
            session.invalidate();

            return "Yay! You got it!";
        } else {

            return "<p>Sorry, " + userNumber + " isn't it.</p>"
                    + "<p>Guess again...</p>";
        }
    }
}

