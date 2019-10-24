package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.StationDao;
import com.hykj.mono.entity.Station;
import com.hykj.mono.service.StationService;
import com.hykj.mono.vo.R;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl extends ServiceImpl<StationDao, Station> implements StationService {

    @Override
    public R getStationsByTypeId(int id) {
        List<Station> list = getBaseMapper().selectList(new QueryWrapper<Station>().eq("type_id", id));
        return R.setOK(list);
    }
}
