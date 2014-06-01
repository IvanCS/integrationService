package com.ipetrushin.syncher.wsbl.dao;

/**
 * Created with IntelliJ IDEA.
 * User: ipetrush
 * Date: 29.05.14
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
public interface ResumeDAO extends GenericDAO {
    boolean isRequestPermittedForTheUser(Integer userId,Integer resumeId);
}
