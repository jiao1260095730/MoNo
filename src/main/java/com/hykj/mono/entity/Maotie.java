package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("maotie")
public class Maotie {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "type_id")
    private Integer typeId;

    @TableField(value = "shoucang_num")
    private Integer shoucangNum;

    @TableField(value = "zan_num")
    private Integer zanNum;

    @TableField(value = "img_url")
    private String imgurl;

    @TableField(value = "create_time")
    private Data createTime;

    @TableField(value = "morning_pm")
    private String morningPm;
}
