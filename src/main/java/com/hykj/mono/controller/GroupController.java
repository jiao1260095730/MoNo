package com.hykj.mono.controller;

import com.hykj.mono.service.GroupService;
import com.hykj.mono.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "小组展示",tags = "发现小组展示")
public class GroupController {
    @Autowired
    GroupService groupService;

    @PostMapping("/group/groupAll")
    @ApiOperation(value = "展示小组列表中的所有小组",notes = "展示所有的小组")
    public R showAll() {
        return groupService.showAll();
    }
}
