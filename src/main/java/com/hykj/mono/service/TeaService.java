package com.hykj.mono.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hykj.mono.entity.Maotie;
import com.hykj.mono.vo.R;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeaService extends IService<Maotie> {
    R seletTea(String ite);

    R seletToMorning(String ite);

    R seletToPm(String ite);

    R selectAdmin(String ite, int adminId);

    R clickZan(int tieZeId);

    R clickShouCang(int userID, int tieZeId);
}
