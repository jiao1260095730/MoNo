package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.entity.Daily;
import com.hykj.mono.vo.R;

public interface DailyService extends IService<Daily> {
    R dailyAll();
}
