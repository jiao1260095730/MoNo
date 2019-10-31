package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.DailyDao;
import com.hykj.mono.entity.Daily;
import com.hykj.mono.service.DailyService;
import com.hykj.mono.vo.R;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyServiceImpl extends ServiceImpl<DailyDao, Daily> implements DailyService {
    @Override
    public R dailyAll() {
        List<Daily> dailyList = getBaseMapper().selectList(new QueryWrapper<>());
        return R.setOK(dailyList);
    }
}
