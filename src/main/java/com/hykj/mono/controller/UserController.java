package com.hykj.mono.controller;

import com.hykj.mono.dto.UserDto;
import com.hykj.mono.dto.UpdateUser;
import com.hykj.mono.entity.User;
import com.hykj.mono.service.UserService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@Api(value = "关于用户的相关接口", tags = "实现我的界面用户相关功能")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/user/login.do")
    @ApiOperation(value = "登录", notes = "输入手机号和密码登录")
    public R login(UserDto userDto) {
        return userService.login(userDto);
    }

    @PostMapping("/api/user/register.do")
    @ApiOperation(value = "注册用户", notes = "进行用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "手机号", name = "phone", required = true, dataType = "String"),
            @ApiImplicitParam(value = "密码", name = "password", required = true, dataType = "String")
    })
    public R register(User user) {
        return userService.register(user);
    }


    @PostMapping("/api/user/verifyPhone.do")
    @ApiOperation(value = "验证手机号", notes = "输入手机号进行验证")
    @ApiImplicitParam(value = "手机号", name = "phone", required = true, dataType = "String")
    public R verifyPhone(String phone) {
        return userService.verify(phone);
    }

    @GetMapping("/api/user/showUser.do")
    @ApiOperation(value = "展示用户信息", notes = "进入我的页面，展示用户信息")
    public R showUserInfo() {
        return userService.showUserInfo();
    }


    @ApiOperation("修改用户信息")
    @PostMapping("/api/user/update.do")
    public R update( UpdateUser updateUser ) {

        userService.updateByPhone(updateUser);
        return R.setOK("success");
    }

    @GetMapping("/api/user/showConcern.do")
    @ApiOperation(value = "获取关注的所有用户", notes = "我的页面，点击关注查看我关注的所有用户")
    public R showConcern(Integer id) {
        return userService.showConcern(id);
    }

    @GetMapping("/api/user/showFans.do")
    @ApiOperation(value = "获取用户的所有粉丝", notes = "我的页面，点击关注你查看所有关注我的用户")
    public R showFans(Integer id) {
        return userService.showFans(id);
    }

    @GetMapping("/api/user/showZhuTiZhan.do")
    @ApiOperation(value = "获取用户关注的所有主题站", notes = "我的页面，我关注的主题站查看我关注的所有主题站")
    public R showZhuTiZhan(Integer id) {
        return userService.showZhuTiZhan(id);
    }

    @GetMapping("/api/user/showXiangCe.do")
    @ApiOperation(value = "获取用户的相册信息", notes = "我的页面，用户相册信息")
    public R showXiangCe(Integer id) {
        return userService.showXiangCe(id);
    }

    @GetMapping("/api/stationDetails/userInfo")
    @ApiOperation(value = "用于主题站内展示拥有者信息",notes = "用于主题站内展示拥有者信息")
    public R showUserInfoInStation(int id) {
        return userService.getUserByStationId(id);
    }





    /*
     *code is far away from bug with the animal protecting
     *                    ┏┓　　　┏┓
     *                 ┏┛┻━━━┛┻┓
     *                 ┃　　　　　　　┃ 　
     *                 ┃　　　━　　　┃
     *                 ┃　┳┛　┗┳　┃
     *                 ┃　　　　　　　┃
     *                 ┃　　　┻　　　┃
     *                 ┃　　　　　　　┃
     *                 ┗━┓　　　┏━┛
     *                 　　┃　　　┃神兽保佑
     *                 　　┃　　　┃代码无BUG！
     *                 　　┃　　　┗━━━┓
     *                 　　┃　　　　　　　┣┓
     *                 　　┃　　　　　　　┏┛
     *                 　　┗┓┓┏━┳┓┏┛
     *                 　　 ┃┫┫　┃┫┫
     *                 　　┗┻┛　┗┻┛
     *
     */
}
