package com.hykj.mono.controller;

import com.hykj.mono.service.StationService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "发现页面功能展示",tags = "发现页面功能展示")
public class FindController {
    @Autowired
    StationService stationService;

    @PostMapping("/find/stationAll")
    @ApiOperation(value = "展示所有的主题站",notes = "展示所有的主题站")
    public R StationAll() {
        return stationService.stationAll();
    }

}
