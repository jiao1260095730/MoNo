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

    @GetMapping("/station/getStationById")
    @ApiOperation(value = "按id查找对应的主题站",notes = "按id查找对应的主题站")
    @ApiImplicitParam(value = "主题站的id",name = "id",required = true,dataType = "int",defaultValue = "1")
    public R getStationById(int id) {
        return stationService.getStationById(id);
    }

    @GetMapping("/station/getStationRankingList")
    @ApiOperation(value = "获取主题站排行榜中所有的主题站",notes = "获取主题站排行榜中所有的主题站")
    public R getStationRankingList() {
        return stationService.getStationRankingList();
    }

    @GetMapping("/station/getAppRecommend")
    @ApiOperation(value = "获取官方推荐的主题站",notes = "获取官方推荐的主题站")
    public R getAppRecommend() {
        return stationService.getAppRecommend();
    }
}
