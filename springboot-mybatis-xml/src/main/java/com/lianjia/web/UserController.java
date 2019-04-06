package com.lianjia.web;

import com.lianjia.domain.User;
import com.lianjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * User的Controller
 * @author panli
 * @date 2019.01.23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        List<User> users = userService.getAllUsers();
        return users;
    }
}
