package com.ipetrushin.syncher.wsbl.dao;

import com.ipetrushin.syncher.wsbl.model.ResumeEntity;

import javax.ejb.Stateless;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class ResumeDAOImpl extends GenericDAOImpl<ResumeEntity,Integer> implements ResumeDAO {
    public boolean isRequestPermittedForTheUser(Integer userId,Integer resumeId)  {
           return true;
    }
}
