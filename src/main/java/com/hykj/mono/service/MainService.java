package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.vo.R;
import com.hykj.mono.vo.Show;

public interface MainService extends IService<Show> {
    R getShowsByStationTypeId(int id);
}
