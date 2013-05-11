package com.ipetrushin.syncher.wsrp.dao;

import com.googlecode.genericdao.search.Search;
import com.googlecode.genericdao.search.hibernate.HibernateSearchProcessor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class GenericDAOImpl<T, ID extends Serializable>  implements GenericDAO{

    @Autowired
    private  SessionFactory sessionFactory;

    public GenericDAOImpl() {

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Transactional
    @Override
    public Session getSession() {
      return getSessionFactory().getCurrentSession();
    }

    @Transactional
    @Override
    public HibernateSearchProcessor getSearchProcessor() {
        return HibernateSearchProcessor.getInstanceForSessionFactory(getSessionFactory());  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public Object find(Serializable serializable) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public Object[] find(Serializable... serializables) {
        return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public Object getReference(Serializable serializable) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public Object[] getReferences(Serializable... serializables) {
        return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public boolean save(Object entity) {
        boolean isSaved = true;

        try{

            save(entity);
        }catch (Exception e){
            e.printStackTrace();
            isSaved = false;
        }

        return  isSaved;
    }

    @Transactional
    @Override
    public boolean[] save(Object... entities) {
        return new boolean[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public boolean remove(Object entity) {
        boolean isRemoved = true;

        try{
            getSession().delete(entity);
        }catch (Exception e){
            e.printStackTrace();
            isRemoved = false;
        }

        return  isRemoved;
    }

    @Transactional
    @Override
    public void remove(Object... entities) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public boolean removeById(Serializable serializable) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public void removeByIds(Serializable... serializables) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Transactional
    @Override
    public List findAll() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
