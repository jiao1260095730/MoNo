package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)

    private Integer id;

    @TableField("user_name")
    private String username;

    private String password;
    private String nickname;
    private String gender;
    private String phone;

    @TableField("head_img_url")
    private String headimgurl;

    private String xingzuo;
    private String suozaidi;
    private String gexingqianming;

    @TableField("xiangce_id")
    private int xiangceid;

    @TableField("shoucang_id")
    private int shoucang_id;

    @TableField("guanzhuzhan_id")
    private int guanzhuzhan_id;

    @TableField("maotie_id")
    private int maotie_id;

}
