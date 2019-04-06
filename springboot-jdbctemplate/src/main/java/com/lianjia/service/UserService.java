package com.lianjia.service;

import com.lianjia.dao.UserDao;
import com.lianjia.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * User的业务类
 * @author panli
 * @date 2019.01.23
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<Map<String, Object>> getUsers(){
        List<Map<String, Object>> users = userDao.getAllUsers();
        return users;
    }
}
