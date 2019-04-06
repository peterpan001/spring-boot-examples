package com.lianjia.service;

import com.lianjia.domain.User;
import com.lianjia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author panli
 * User的业务类
 * @date 2019.01.23
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        List<User> users = userMapper.getAllUsers();
        return users;
    }
}
