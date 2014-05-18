package com.ipetrushin.syncher.webclient.beans;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.Serializable;

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


    private String login;
    private String password;

    Integer userNumber;
    String response;

    public AuthorizationMBean() {
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void authorize(){
           try{
               FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");


           }   catch (Exception e){
               e.printStackTrace();
           }
       // return "home.xhtml?faces-redirect=true&amp;includeViewParams=true";
    }

    public String authorize2(){

         return "home.xhtml?faces-redirect=true&amp;includeViewParams=true";
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

