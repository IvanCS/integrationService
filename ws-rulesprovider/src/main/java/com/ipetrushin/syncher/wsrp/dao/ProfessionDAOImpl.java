package com.ipetrushin.syncher.wsrp.dao;
import com.ipetrushin.syncher.wsrp.entities.ProfessionEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: Ivan Date: 5/9/13 Time: 10:51 PM To change
 * this template use File | Settings | File Templates.
 * @author Ivan
 * @version 1.0
 * @created 10-May-2013 4:48:16 PM
 */
@Repository
public class ProfessionDAOImpl implements ProfessionDAO {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private DataSource dataSourceTransactionManager;
    @Autowired
    private HibernateTransactionManager hibernateTransactionManager;

	public ProfessionDAOImpl(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param newEntity
	 */
    @Transactional
	public boolean addEntity(ProfessionEntity newEntity){

        Session session = sessionFactory.getCurrentSession();
        session.save(newEntity) ;

        Query query = session.createQuery("from ProfessionEntity p");
        List<ProfessionEntity> list = query.list();
		return true;
	}

	/**
	 * 
	 * @param professionName
	 */
	public ProfessionEntity findByName(String professionName){
		return null;
	}

	/**
	 * 
	 * @param newEntity
	 */
	public boolean changeEntity(ProfessionEntity newEntity){
		return false;
	}

	/**
	 * 
	 * @param entity
	 */
	public boolean deleteEntity(ProfessionEntity entity){
		return false;
	}

	/**
	 * 
	 * @param sourceEntity
	 * @param referenceValue
	 */
	public boolean bindReferenceValueHH(ProfessionEntity sourceEntity, String referenceValue){
		return false;
	}

	/**
	 * 
	 * @param sourceEntity
	 * @param referenceValue
	 */
	public boolean bindReferenceValueMonster(ProfessionEntity sourceEntity, String referenceValue){
		return false;
	}

}