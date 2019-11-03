package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.Station;
import com.hykj.mono.vo.ShowStation;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StationDao extends BaseMapper<Station> {

    @Select("select s.id,s.title,s.descr,s.head_img,s.background_img,s.focus_num,t.type_name from station s,type t,station_list sl WHERE s.id = sl.station_id and s.type_id=t.id")
    @Results(id = "ShowStation",value = {
            @Result(column = "type_name", property = "typeName"),
            @Result(column = "head_img", property = "headImg"),
            @Result(column = "background_img", property = "backgroundImg"),
            @Result(column = "focus_num", property = "focusNum"),
    })
    List<ShowStation> getStationRankingList();

    @Select("select s.* from station s inner join app_recommend r on s.id = r.station_id")
    List<Station> getAppRecommend();
}
