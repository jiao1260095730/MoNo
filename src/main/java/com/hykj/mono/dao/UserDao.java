package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

public interface UserDao  extends BaseMapper<User> {

    @Select("select * from user where phone = #{phone}")
    @ResultType(User.class)
    User selectUserByPhone(String phone);

}
