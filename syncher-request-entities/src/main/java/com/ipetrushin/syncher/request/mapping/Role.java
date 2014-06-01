package com.ipetrushin.syncher.request.mapping;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public class Role implements Serializable {

    private int roleId;
    private String name;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
