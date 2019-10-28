package com.hykj.mono.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hykj.mono.entity.Station;
import com.hykj.mono.entity.ZhanTiezi;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FindDao extends BaseMapper<ZhanTiezi> {

    @Select("select z.* from zhan_tiezi z inner join station s on z.station_id = s.id where z.station_id=#{stationId}")
    List<ZhanTiezi> selectTitleByStationId(int stationId);

    @Select("select background_img,id from station")
    List<Station> getStationImgAndId();

    @Select("select * from station where background_img = #{backgroundImg}")
    List<Station> getStationByImg(String backgroundImg);
}
