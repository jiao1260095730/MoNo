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

    @TableField("guanzhuzhan_num")
    private int guanZhuZhanNum;

    @TableField("concern_num")
    private int concernNum;

    @TableField("fans_num")
    private int fansNum;
}
