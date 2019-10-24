package com.hykj.mono.controller;

import com.hykj.mono.dto.UserDto;
import com.hykj.mono.entity.User;
import com.hykj.mono.service.UserService;
import com.hykj.mono.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/user/login.do")
    public R login(UserDto userDto){
        return  userService.login(userDto);
    }

}
