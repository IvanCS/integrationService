package com.ipetrushin.syncher.wsbl.dao;

import com.ipetrushin.syncher.request.mapping.User;



/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */

public interface UserDAO extends GenericDAO {

    public boolean authorize(User user) throws Exception;
    public boolean registrate(User user) throws Exception;

}
