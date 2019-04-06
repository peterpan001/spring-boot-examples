package com.lianjia.web;

import com.lianjia.entity.User;
import com.lianjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户的Controller层
 * @author panli
 * @date 2019.01.23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getTest1Users")
    public List<User> getTest1Users(){
        return userService.getTest1Users();
    }

    @RequestMapping("/getTest2Users")
    public List<User> getTest2Users(){
        return userService.getTest2Users();
    }
}
