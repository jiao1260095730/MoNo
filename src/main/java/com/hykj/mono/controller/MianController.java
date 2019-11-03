package com.hykj.mono.controller;

import com.hykj.mono.service.MainService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "主页所有功能的实现",tags = "主页所有功能的实现")
public class MianController {

    @Autowired
    MainService mainService;

    @GetMapping("/main/get")
    @ApiOperation(value = "根据分类展示所有此类型主题站的文章")
    @ApiImplicitParam(value = "主题站所属的类型id",name = "id",defaultValue = "7",required = true,dataType = "int")
    public R getShowsByStationTypeId(int id) {
        return mainService.getShowsByStationTypeId(id);
    }
}
