package com.hykj.mono.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)

    private Integer id;
    private String user_name;
    private String password;
    private String nickname;
    private String gender;
    private String phone;
    private String head_img_url;
    private String xingzuo;
    private String suozaidi;
    private String gexingqianming;
    private int xiangce_id;
    private int shoucang_id;
    private int guanzhuzhan_id;
    private int maotie_id;

}
