package com.lianjia.mapper;

import com.lianjia.domain.User;

import java.util.List;

/**
 * User的Mapper接口
 * @author panli
 * @date 2019.01.23
 */
public interface UserMapper {

    List<User> getAllUsers();
}
