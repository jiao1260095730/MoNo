package com.hykj.mono.controller;

import com.hykj.mono.service.FindService;
import com.hykj.mono.service.StationService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "发现页面功能展示",tags = "发现页面功能展示")
public class FindController {
    @Autowired
    StationService stationService;
    @Autowired
    FindService findService;

    @PostMapping("/find/stationAll")
    @ApiOperation(value = "展示所有的主题站",notes = "展示所有的主题站")
    public R StationAll() {
        return stationService.stationAll();
    }

    @PostMapping("/find/titleAll")
    @ApiOperation(value = "根据公众号的ID展示该公众号的所有帖子",notes = "根据公众号的ID展示该公众号的所有帖子")
    @ApiImplicitParam(value = "主题站的id",name = "stationId",required = true,dataType = "int")
    public R titleAll(int stationId) {
        return findService.selectTitleByStationId(stationId);
    }

    @PostMapping("/find/getStationImg")
    @ApiOperation(value = "获取主题站的图片和ID",notes = "获取主题站的图片和ID")
    public R getStationImgAndId() {
        return findService.getStationImgAndId();
    }

    @PostMapping("/find/getStationByImg")
    @ApiOperation(value = "根据图片展示主题站",notes = "根据图片展示主题站")
    @ApiImplicitParam(value = "图片的URL",name = "backgroundImg",required = true,dataType = "string")
    public R getStationByImg(String backgroundImg) {
        return findService.getStationByImg(backgroundImg);
    }
}
