package com.ipetrushin.syncher.wsrp.dao;

import com.googlecode.genericdao.search.hibernate.HibernateSearchProcessor;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ivan
 * Date: 5/11/13
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO<T, ID extends Serializable> {
    /**
     * <p/>
     * Get the entity with the specified type and id from the datastore.
     * <p/>
     * <p/>
     * If none is found, return null.
     */
    public Session getSession();

    public HibernateSearchProcessor getSearchProcessor();

    public T find(ID id);

    /**
     * Get all entities of the specified type from the datastore that have one
     * of these ids.
     */
    public T[] find(ID... ids);

    /**
     * <p/>
     * Get a reference to the entity with the specified type and id from the
     * datastore.
     * <p/>
     * <p/>
     * This does not require a call to the datastore and does not populate any
     * of the entity's values. Values may be fetched lazily at a later time.
     * This increases performance if a another entity is being saved that should
     * reference this entity but the values of this entity are not needed.
     *
     * @throws a HibernateException if no matching entity is found
     */
    public T getReference(ID id);

    /**
     * <p/>
     * Get a reference to the entities of the specified type with the given ids
     * from the datastore.
     * <p/>
     * <p/>
     * This does not require a call to the datastore and does not populate any
     * of the entities' values. Values may be fetched lazily at a later time.
     * This increases performance if a another entity is being saved that should
     * reference these entities but the values of these entities are not needed.
     *
     * @throws a HibernateException if any of the matching entities are not
     *           found.
     */
    public T[] getReferences(ID... ids);

    /**
     * <p/>
     * If the id of the entity is null or zero, add it to the datastore and
     * assign it an id; otherwise, update the corresponding entity in the
     * datastore with the properties of this entity. In either case the entity
     * passed to this method will be attached to the session.
     * <p/>
     * <p/>
     * If an entity to update is already attached to the session, this method
     * will have no effect. If an entity to update has the same id as another
     * instance already attached to the session, an error will be thrown.
     *
     * @return <code>true</code> if create; <code>false</code> if update.
     */
    public boolean save(T entity);

    /**
     * <p/>
     * For each entity, if the id of the entity is null or zero, add it to the
     * datastore and assign it an id; otherwise, update the corresponding entity
     * in the datastore with the properties of this entity. In either case the
     * entity passed to this method will be attached to the session.
     * <p/>
     * <p/>
     * If an entity to update is already attached to the session, this method
     * will have no effect. If an entity to update has the same id as another
     * instance already attached to the session, an error will be thrown.
     */
    public boolean[] save(T... entities);

    /**
     * Remove the specified entity from the datastore.
     *
     * @return <code>true</code> if the entity is found in the datastore and
     *         removed, <code>false</code> if it is not found.
     */
    public boolean remove(T entity);

    /**
     * Remove all of the specified entities from the datastore.
     */
    public void remove(T... entities);

    /**
     * Remove the entity with the specified type and id from the datastore.
     *
     * @return <code>true</code> if the entity is found in the datastore and
     *         removed, <code>false</code> if it is not found.
     */
    public boolean removeById(ID id);

    /**
     * Remove all the entities of the given type from the datastore that have
     * one of these ids.
     */
    public void removeByIds(ID... ids);

    /**
     * Get a list of all the objects of the specified type.
     */
    public List<T> findAll();
}
