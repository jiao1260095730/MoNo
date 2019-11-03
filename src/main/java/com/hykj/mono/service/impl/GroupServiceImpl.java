package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.GroupDao;
import com.hykj.mono.entity.Group;
import com.hykj.mono.service.GroupService;
import com.hykj.mono.vo.R;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl extends ServiceImpl<GroupDao, Group> implements GroupService {

    @Override
    public R showAll() {
        List<Group> groupList = getBaseMapper().selectList(new QueryWrapper<>());
        return R.setOK(groupList);
    }
}
