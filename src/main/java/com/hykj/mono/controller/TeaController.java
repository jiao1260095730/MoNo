package com.hykj.mono.controller;

import com.hykj.mono.service.TeaService;
import com.hykj.mono.utils.TimeFormat;
import com.hykj.mono.vo.R;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Date;

@RestController()
@Api(value = "早午茶页面功能展示", tags = "早午茶页面功能展示")
public class TeaController {

    @Autowired
   TeaService teaService;
    @Autowired
    TimeFormat timeFormat;

    @PostMapping("/tea/selectToMorning")
    @ApiOperation(value = "随机查取8~11个帖子,保存为当天的早茶帖子", notes = "随机查取8~11个帖子,保存为当天的早茶帖子")
    @ApiImplicitParam(value = "指定的日期yyyy-MM-dd HH:mm:ss",name = "morningDate",required = true,dataType = "string")
    public R selectToMorning(String morningDate) throws ParseException {
        Date date = timeFormat.stringToDate(morningDate);
        //日期为上午或下午
        String time = timeFormat.dateFormat(date);
        //日期转化为yyyy-MM-dd
        String dateFormat = timeFormat.getTimeFormat(date);
        String ite = dateFormat+"-"+time;
        return teaService.seletToMorning(ite);
    }

    @PostMapping("/tea/selectToPm")
    @ApiOperation(value = "随机查取8~11个帖子,保存为当天午茶帖子", notes = "随机查取8~11个帖子,保存为当天午茶帖子")
    @ApiImplicitParam(value = "指定的日期yyyy-MM-dd HH:mm:ss",name = "pmDate",required = true,dataType = "string")
    public R selectToPm(String pmDate) throws ParseException {
        Date date = timeFormat.stringToDate(pmDate);
        //日期为上午或下午
        String time = timeFormat.dateFormat(date);
        //日期转化为yyyy-MM-dd
        String dateFormat = timeFormat.getTimeFormat(date);
        String ite = dateFormat+"-"+time;
        return teaService.seletToPm(ite);
    }

    @PostMapping("/tea/selectTea")
    @ApiOperation(value = "指定日期早午茶帖子展示",notes = "早午茶帖子展示")
    @ApiImplicitParam(value = "指定的日期yyyy-MM-dd HH:mm:ss",name = "oneDate",required = true,dataType = "string")
    public R seletTea(String oneDate) throws ParseException {

        Date date = timeFormat.stringToDate(oneDate);
        //日期为上午或下午
        String time = timeFormat.dateFormat(date);
        //日期转化为yyyy-MM-dd
        String dateFormat = timeFormat.getTimeFormat(date);
        String ite = dateFormat+"-"+time;

            return teaService.seletTea(ite);
    }

    @PostMapping("/tea/selectAdmin")
    @ApiOperation(value = "官方早午茶帖子",notes = "官方早午茶帖子")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "指定的日期yyyy-MM-dd HH:mm:ss",name = "oneDate",required = true,dataType = "string"),
            @ApiImplicitParam(value = "官方帖子Id",name = "adminId",required = true,dataType = "int")
    })
    public R seletTeaAdmin(String oneDate , int adminId) throws ParseException {

        Date date = timeFormat.stringToDate(oneDate);
        //日期为上午或下午
        String time = timeFormat.dateFormat(date);
        //日期转化为yyyy-MM-dd
        String dateFormat = timeFormat.getTimeFormat(date);
        String ite = dateFormat+"-"+time;

        return teaService.selectAdmin(ite, adminId);
    }




}
