package edu.swpu.dao.impl;


import edu.swpu.dao.UserDao;
import edu.swpu.dao.base.BaseDaoImpl;
import edu.swpu.domain.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    private static final String NAMESPACE = "edu.swpu.dao.UserDao.";
    private static final String QUERY_ACCOUNTNUM_STATEMENT = "selectAccountNum";
    @Override
    public String getNameSpace(String statement) {
        return NAMESPACE+statement;
    }

    @Override
    public String selectAccountNum(User condition) throws Exception {
        return this.select(getNameSpace(QUERY_ACCOUNTNUM_STATEMENT),condition);
    }
}
