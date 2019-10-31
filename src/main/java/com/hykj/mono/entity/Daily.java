package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("daily")
public class Daily {

private int id;

private String theme;

private String author;

private String content;
//内容
}
