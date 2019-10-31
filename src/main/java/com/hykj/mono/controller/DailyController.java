package com.hykj.mono.controller;

import com.hykj.mono.service.DailyService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "日签功能",tags = "日签的全部接口")
public class DailyController {

    @Autowired
    DailyService dailyService;
    @PostMapping("/daily/dailyAll")
    @ApiOperation(value = "展示做日签中所有的日签",notes = "展示所有的主题站")
    public R DailyAll() {
        return dailyService.dailyAll();
    }

}
