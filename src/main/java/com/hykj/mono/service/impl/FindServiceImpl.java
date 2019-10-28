package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.FindDao;
import com.hykj.mono.entity.Station;
import com.hykj.mono.entity.ZhanTiezi;
import com.hykj.mono.service.FindService;
import com.hykj.mono.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindServiceImpl extends ServiceImpl<FindDao, ZhanTiezi> implements FindService {
    @Autowired
    FindDao findDao;

    @Override
    public R selectTitleByStationId(int stationId) {
        List<ZhanTiezi> list = findDao.selectTitleByStationId(stationId);
        return R.setOK(list);
    }

    @Override
    public R getStationByImg(String backgroundImg) {
        List<Station> list = findDao.getStationByImg(backgroundImg);
        return R.setOK(list);
    }

    @Override
    public R getStationImgAndId() {
        List<Station> list = findDao.getStationImgAndId();
        return R.setOK(list);
    }
}
