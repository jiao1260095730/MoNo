package com.hykj.mono.utils;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

public class PutImg {
    public String uploadImg(@RequestParam MultipartFile image) {
        String url = null;
        if (image.isEmpty()) {

            return "400,文件为空，请重新上传";
        }

        try {
            byte[] bytes = image.getBytes();
            String imageName = UUID.randomUUID().toString();

            QiniuCloudUtil qiniuUtil = new QiniuCloudUtil();
            try {
                //使用base64方式上传到七牛云
                 url = qiniuUtil.put64image(bytes, imageName);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return url;
        } catch (IOException e) {

            return "500,文件上传发生异常！";
        }
    }
}
