package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("Zhan_Tiezi")
public class ZhanTiezi {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "station_id")
    private Integer stationId;

    @TableField(value = "create_time")
    private Date createTime;

    @TableField(value = "fengmian_img")
    private String fengmianImg;

    private String descr;

    private String details;

    }