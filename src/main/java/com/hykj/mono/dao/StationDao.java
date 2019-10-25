package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.Station;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StationDao extends BaseMapper<Station> {

    @Select("select s.* from station s inner join station_list sl on s.id = sl.station_id")
    List<Station> getStationRankingList();

    @Select("select s.* from station s inner join app_recommend r on s.id = r.station_id")
    List<Station> getAppRecommend();
}
