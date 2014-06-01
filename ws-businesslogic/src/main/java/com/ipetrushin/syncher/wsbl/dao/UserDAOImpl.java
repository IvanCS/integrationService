package com.ipetrushin.syncher.wsbl.dao;

import com.ipetrushin.syncher.request.mapping.User;
import com.ipetrushin.syncher.wsbl.model.UserEntity;

import javax.ejb.Stateless;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class UserDAOImpl extends GenericDAOImpl<UserEntity,Serializable> implements UserDAO  {
    @Override
    public boolean authorize(User user) throws Exception {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean registrate(User user) throws Exception {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
