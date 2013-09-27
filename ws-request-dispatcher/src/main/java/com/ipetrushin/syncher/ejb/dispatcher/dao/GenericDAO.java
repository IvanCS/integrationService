package com.ipetrushin.syncher.ejb.dispatcher.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO {


    public <T> T find(Serializable id);

    public <T> T getReference(Serializable id);

    public boolean save(Object entity);

    public boolean remove(Object entity);

    public <T> List<T> findAll();
}
