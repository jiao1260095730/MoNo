package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.vo.Show;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MainDao extends BaseMapper<Show> {

    @Select("select a.*,s.title,t.type_name from article a,station s,type t WHERE a.station_id = s.id and s.type_id = t.id and t.id = #{id}")
    @Results(id = "showMap",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "title"),
            @Result(column = "creat_time",property = "creatTime"),
            @Result(column = "descr",property = "desc"),
            @Result(column = "pinglun_num",property = "pingLunNum"),
            @Result(column = "src",property = "src"),
            @Result(column = "zan_num",property = "zanNum"),
            @Result(column = "title",property = "stationName"),
            @Result(column = "type_name",property = "stationType")
    })
    List<Show> getShowsByStationTypeId(int id);
}
