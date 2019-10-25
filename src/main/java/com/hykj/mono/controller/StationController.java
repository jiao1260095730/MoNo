package com.hykj.mono.controller;

import com.hykj.mono.service.StationService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@Api(value = "实现有关主题站的功能",tags = "实现有关主题站的功能")
public class StationController {
    @Autowired
    StationService stationService;

    @GetMapping("/station/getStationsByType")
    @ApiOperation(value = "按类别查找相应分类的主题站",notes = "按类别查找相应分类的主题站")
    @ApiImplicitParam(value = "主题站的类别id",name = "id",required = true,dataType = "int",defaultValue = "7")
    public R getStationsByTypeId(int id) {
        return stationService.getStationsByTypeId(id);
    }
}
