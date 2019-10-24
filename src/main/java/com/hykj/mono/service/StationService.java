package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.entity.Station;
import com.hykj.mono.vo.R;

public interface StationService extends IService<Station> {

    R getStationsByTypeId(int id);
}
