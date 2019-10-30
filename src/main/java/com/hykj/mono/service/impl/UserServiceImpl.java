package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.UserDao;
import com.hykj.mono.dto.UserDto;
import com.hykj.mono.entity.User;
import com.hykj.mono.service.UserService;
import com.hykj.mono.vo.R;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public R login(UserDto userDto) {
        User user = getBaseMapper().selectOne(new QueryWrapper<User>().eq("phone", userDto.getPhone()));


        System.out.println(user);
        //查询
        if (user != null) {
            //3、验证密码
            if (Objects.equals(user.getPassword(), user.getPassword())) {
                //4、操作Shiro
                //1、创建主题对象
                Subject subject = SecurityUtils.getSubject();
                //2、创建令牌 用户名密码令牌
                UsernamePasswordToken token = new UsernamePasswordToken(userDto.getPhone(), userDto.getPassword());
                //3、存储当前的User
                subject.getSession().setAttribute("phone", userDto.getPhone());
                //4、登录 告诉Shiro登录成功
                subject.login(token);
                return R.setOK("OK");
            }
        }
        return R.setERROR();
    }

    @Override
    public R register(User user) {
        if (user != null) {
            int i = getBaseMapper().insert(user);
            if (i > 0) {
                return R.setOK("success");
            }
        }
        return R.setERROR();
    }

    @Override
    public R verify(String phone) {
        if (phone != null) {
            int result = getBaseMapper().selectCount(new QueryWrapper<User>().eq("phone", phone));
            if (result == 1) {
                return R.setERROR();
            } else {
                return R.setOK("success");
            }
        } else {
            return R.setERROR();
        }
    }

    @Override
    public R showUserInfo() {

        //String phone = (String) SecurityUtils.getSubject().getSession().getAttribute("phone");
        return R.setOK(userDao.selectUserByPhone("13213538971"));
    }

}