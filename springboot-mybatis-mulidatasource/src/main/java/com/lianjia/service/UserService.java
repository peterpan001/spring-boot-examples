package com.lianjia.service;

import com.lianjia.entity.User;
import com.lianjia.mapper.test1.User1Mapper;
import com.lianjia.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    public List<User> getTest1Users(){
        return user1Mapper.getAllUsers();
    }

    public List<User> getTest2Users(){
        return user2Mapper.getAllUsers();
    }
}
