package com.lianjia.web;

import com.lianjia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * User的Controller类
 * @author panli
 * @date 2019.01.23
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers")
    public List<Map<String, Object>> getUsers(){
        List<Map<String, Object>> users = userService.getUsers();
        return users;
    }
}
