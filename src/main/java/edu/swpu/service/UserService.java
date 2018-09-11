package edu.swpu.service;

import edu.swpu.domain.User;
import edu.swpu.service.base.BaseService;

public interface UserService extends BaseService<User> {
    //自定义查询
    public String selectAccountNum(User condition) throws Exception;
}
