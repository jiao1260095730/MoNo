package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.entity.ZhanTiezi;
import com.hykj.mono.vo.R;

public interface FindService extends IService<ZhanTiezi> {
    R selectTitleByStationId(int stationId);
}
