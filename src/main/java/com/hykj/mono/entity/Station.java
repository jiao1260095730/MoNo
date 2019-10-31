package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("station")
public class Station {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String title;

    private String descr;

    @TableField(value = "head_img")
    private String headImg;

    @TableField(value = "background_img")
    private String backgroundImg;

    @TableField(value = "focus_num")
    private Integer focusNum;

    @TableField(value = "type_id")
    private Integer typeId;
}