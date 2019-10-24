package com.hykj.mono.entity;

import lombok.Data;

@Data
public class Station {
    private Integer id;

    private String title;

    private String descr;

    private Integer userId;

    private String headImg;

    private String backgroundImg;

    private Integer focusNum;

    private Integer typeId;
}