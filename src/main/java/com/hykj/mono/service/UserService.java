package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.hykj.mono.dto.UserDto;
import com.hykj.mono.entity.User;
import com.hykj.mono.vo.R;

public interface UserService  extends IService<User>{

    R login(UserDto userDto);


    R register(User user);

    R verify(String phone);


    //R forget(String phone);

    User selectUser();
}
