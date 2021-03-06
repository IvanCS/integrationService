package com.ipetrushin.syncher.wsbl.dao;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */

public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO {

    @PersistenceContext(unitName = "persistenceUnit", type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

    private Class<T> entityClass;

    public GenericDAOImpl() {

    }

    protected EntityManager getEM(){
         return entityManager;
    }
    public GenericDAOImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }



    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public <T> T find(Serializable id) {
        Object entity = null;
        try {

            entityManager.find(getEntityClass(),id)  ;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return (T) entity;
        }
    }

    @Override
    public <T> T getReference(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Object entity) {
        boolean isSaved = false;
        try {
            entityManager.persist(entity);
            isSaved = true;
        } catch (Exception e) {
            isSaved = false;
            e.printStackTrace();
        } finally {
            return isSaved;
        }
    }

    @Override
    public boolean remove(Object entity) {
        boolean isRemoved = false;
        try {
            entityManager.remove(entity);
            isRemoved = true;
        } catch (Exception e) {
            isRemoved = false;
            e.printStackTrace();
        } finally {
            return isRemoved;
        }
    }

    @Override
    public <T> List<T> findAll() {
        List<T> entities = null;
        try {
            Query query = entityManager.createQuery("from " + getEntityClass().getName());
            entities = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return entities;
        }
    }
}
