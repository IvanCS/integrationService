package com.ipetrushin.syncher.ejb.dispatcher.dao.entities;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 20.09.13
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
@Table(name = "PROFESSIONMONSTER", schema = "PUBLIC", catalog = "PUBLIC")
@Entity
public class ProfessionmonsterEntity {
    private int professionmonsterid;

    @Column(name = "PROFESSIONMONSTERID")
    @Id
    public int getProfessionmonsterid() {
        return professionmonsterid;
    }

    public void setProfessionmonsterid(int professionmonsterid) {
        this.professionmonsterid = professionmonsterid;
    }

    private String name;

    @Column(name = "NAME")
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

        ProfessionmonsterEntity that = (ProfessionmonsterEntity) o;

        if (professionmonsterid != that.professionmonsterid) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = professionmonsterid;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
