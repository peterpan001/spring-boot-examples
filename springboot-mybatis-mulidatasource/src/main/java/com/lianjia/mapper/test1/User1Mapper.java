package com.lianjia.mapper.test1;

import com.lianjia.entity.User;

import java.util.List;
/**
 * 数据库test1中user表所对应的User1Mapper
 * @author panli
 * @date 2019.01.23
 */
public interface User1Mapper {

    List<User> getAllUsers();
}
