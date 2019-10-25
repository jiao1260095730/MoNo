package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.StationDao;
import com.hykj.mono.entity.Station;
import com.hykj.mono.service.StationService;
import com.hykj.mono.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl extends ServiceImpl<StationDao, Station> implements StationService {
    @Autowired
    StationDao stationDao;

    @Override
    public R getStationsByTypeId(int id) {
        List<Station> list = getBaseMapper().selectList(new QueryWrapper<Station>().eq("type_id", id));
        return R.setOK(list);
    }

    @Override
    public R stationAll() {
        List<Station> stationList = getBaseMapper().selectList(new QueryWrapper<>());
        return R.setOK(stationList);
    }

    @Override
    public R getStationById(int id) {
        Station station = getBaseMapper().selectOne(new QueryWrapper<Station>().eq("id",id));
        return R.setOK(station);
    }

    @Override
    public R getStationRankingList() {
        List<Station> list = stationDao.getStationRankingList();
        return R.setOK(list);
    }

    @Override
    public R getAppRecommend() {
        List<Station> list = stationDao.getAppRecommend();
        return R.setOK(list);
    }
}
