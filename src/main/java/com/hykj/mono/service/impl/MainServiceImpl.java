package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.MainDao;
import com.hykj.mono.service.MainService;
import com.hykj.mono.utils.JsonUtils;
import com.hykj.mono.vo.R;
import com.hykj.mono.vo.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainServiceImpl extends ServiceImpl<MainDao, Show> implements MainService {

    @Autowired
    MainDao mainDao;
    @Override
    public R getShowsByStationTypeId(int id) {
        List<Show> list = mainDao.getShowsByStationTypeId(id);
        return R.setOK(list);
    }
}
