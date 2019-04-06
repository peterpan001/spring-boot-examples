package com.lianjia.service;

import com.lianjia.domain.User;
import com.lianjia.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User的业务类
 * @author panli
 * @date 2019.01.23
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUsers(){
        List<User> users = userMapper.getAll();
        return users;
    }
}
