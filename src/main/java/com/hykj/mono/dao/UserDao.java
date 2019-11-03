package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.Station;
import com.hykj.mono.entity.User;
import com.hykj.mono.vo.SimpleUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao  extends BaseMapper<User> {

    @Select("select * from user where phone = #{phone}")
    @ResultType(User.class)
    User selectUserByPhone(String phone);

    @Select("select c.* from user u, user c, user_concern uc where\n" +
            "u.id = uc.user_id and uc.concern_id = c.id and u.id = #{id}")
    @ResultType(User.class)
    List<User> selectConcerns(int id);

    @Select("select c.* from user u, user c, user_concern uc where\n" +
            "u.id = uc.concern_id and uc.user_id = c.id and u.id = #{id}")
    @ResultType(User.class)
    List<User> selectFans(int id);

    @Select("select s.* from user u, station s, user_station us where\n" +
            "u.id = us.uid and s.id = us.station_id and u.id = #{id}")
    @ResultType(Station.class)
    List<User> showZhuTiZhan(Integer id);

    @Select("select xc.img_url from user u, user_xiangce xc where\n" +
            "u.id = xc.user_id and u.id = #{id}")
    @ResultType(String.class)
    List<String> selectAllPhotos(Integer id);

    @Select("select u.id,u.nickname,u.gexingqianming,u.head_img_url from user u inner join user_station us on u.id = us.uid where us.station_id = #{id}")
    @Results(id = "simpleUser",value = {
            @Result(column = "id",property = "userId"),
            @Result(column = "nickname",property = "name"),
            @Result(column = "gexingqianming",property = "desc"),
            @Result(column = "head_img_url",property = "headImg")
    })
    SimpleUser getUserByStationId(int id);
}
