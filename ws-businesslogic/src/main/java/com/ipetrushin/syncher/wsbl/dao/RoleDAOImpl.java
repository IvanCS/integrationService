package com.ipetrushin.syncher.wsbl.dao;

import com.ipetrushin.syncher.wsbl.model.RoleEntity;

import javax.ejb.Stateless;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class RoleDAOImpl extends GenericDAOImpl<RoleEntity,Serializable> implements RoleDAO {
    @Override
    public Integer getRoleIdByUser(Integer userId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
