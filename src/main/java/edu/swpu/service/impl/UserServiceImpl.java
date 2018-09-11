package edu.swpu.service.impl;

import edu.swpu.dao.UserDao;
import edu.swpu.dao.base.BaseDao;
import edu.swpu.domain.User;
import edu.swpu.service.UserService;
import edu.swpu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public BaseDao<User> getDao() {
        return this.userDao;
    }

    @Override
    public String selectAccountNum(User condition) throws Exception {
        return userDao.selectAccountNum(condition);
    }
}
