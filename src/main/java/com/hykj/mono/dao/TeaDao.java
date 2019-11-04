package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.Maotie;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TeaDao extends BaseMapper<Maotie> {

    @Select("select type_id,shoucang_num,img_url, zan_num from maotie where morning_pm = #{ite}")
    List<Maotie> seletTeaAll(String ite);

    @Update("UPDATE maotie SET morning_pm = #{ite} WHERE morning_pm IS NULL ORDER BY zan_num DESC LIMIT 10")
    Integer seletToMoring(String ite);

    @Update("UPDATE maotie SET morning_pm = #{ite} WHERE morning_pm IS NULL ORDER BY zan_num DESC LIMIT 10")
    Integer seletToPm(String ite);

    @Select("select type_id,shoucang_num,img_url, zan_num from maotie where morning_pm = #{ite} AND type_id = #{adminId}")
    List<Maotie> selectAdmin(String ite, int adminId);

    @Update("UPDATE maotie SET zan_num = zan_num + 1 WHERE type_id = #{adminId}")
    Integer clickZan(int tieZeId);

    @Insert("INSERT into user_fans(user_id, station_id) values (#{userID}, #{tieZeId})")
    Integer clickShouCang(int userID, int tieZeId);
}