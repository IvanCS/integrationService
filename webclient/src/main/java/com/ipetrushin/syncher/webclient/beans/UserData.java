package com.ipetrushin.syncher.webclient.beans;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 09.05.14
 * Time: 19:14
 * To change this template use File | Settings | File Templates.
 */

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getWelcomeMessage(){
        return "Hello " + name;
    }
}