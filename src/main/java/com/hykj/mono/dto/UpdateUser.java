package com.hykj.mono.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.hykj.mono.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUser extends User {

    @TableField("head_img_url")
    private String headimgurl;

    private String gender;

    private String nickname;

    private String xingzuo;

    private String suozaidi;

    private String gexingqianming;
}
