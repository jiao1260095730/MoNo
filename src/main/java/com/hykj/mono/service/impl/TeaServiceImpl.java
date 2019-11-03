package com.hykj.mono.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hykj.mono.dao.TeaDao;
import com.hykj.mono.entity.Maotie;
import com.hykj.mono.service.TeaService;
import com.hykj.mono.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TeaServiceImpl extends ServiceImpl<TeaDao, Maotie> implements TeaService {

    @Autowired
    TeaDao teaDao;

    @Override
    public R seletTea(String ite) {
        List<Maotie> list = teaDao.seletTeaAll(ite);
        return R.setOK(list);
    }

    @Override
    public R seletToMorning(String ite) {
        Integer integer = teaDao.seletToMoring(ite);
        return R.setOK(integer);
    }

    @Override
    public R seletToPm(String ite) {
        Integer integer = teaDao.seletToPm(ite);
        return R.setOK(integer);
    }

    @Override
    public R selectAdmin(String ite, int adminId) {
        List<Maotie> list = teaDao.selectAdmin(ite, adminId);
        return R.setOK(list);
    }
}
