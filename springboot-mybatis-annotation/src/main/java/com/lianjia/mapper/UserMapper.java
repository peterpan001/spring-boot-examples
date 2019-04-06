package com.lianjia.mapper;

import com.lianjia.domain.User;
import com.lianjia.enums.UserSexEnum;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author panli
 * @date 2019.01.23
 * User的Mapper类
 */
@Mapper
public interface UserMapper {

    @Select("select * from users")
    @Results({
            @Result(property = "userSex", column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();
}
