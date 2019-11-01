package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("group")
public class Group {
    private int id;

    private String groupname;

    @TableField(value = "group_jianjie")
    private String groupjianlie;

    @TableField(value = "group_person_number")
    private int groupPersonNumber;
}
