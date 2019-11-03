package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.entity.Group;
import com.hykj.mono.vo.R;

public interface GroupService extends IService<Group> {
    R showAll();
}
