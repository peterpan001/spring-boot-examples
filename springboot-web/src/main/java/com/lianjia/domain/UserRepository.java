package com.lianjia.domain;

import com.lianjia.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author panli
 * @date 2019.01.23
 * 用户的接口
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

    User findByUserNameOrEmail(String userName, String email);

}
