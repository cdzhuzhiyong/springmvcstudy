package edu.swpu.dao;


import edu.swpu.dao.base.BaseDao;
import edu.swpu.domain.User;

public interface UserDao extends BaseDao<User> {
    public String selectAccountNum(User condition) throws Exception;
}
