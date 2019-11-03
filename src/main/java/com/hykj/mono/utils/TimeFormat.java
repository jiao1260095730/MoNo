package com.hykj.mono.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TimeFormat {


    /**
     * 将字符串转Date类型
     * @param time
     * @return
     * @throws ParseException
     */
    public Date stringToDate(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(time);
        return date;
    }

    /**
     * 判断日期为上午下午
     */
    public String dateFormat(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH");
        String str = simpleDateFormat.format(date);
        int a = Integer.parseInt(str);

        String time = "0";
        if (a >= 0 && a <= 12) {
           time = "1";
        }
        if (a > 12 && a <= 24) {
           time = "2";
        }
        return time;
    }

    /**
     * 将时间转换为yyyy-MM-dd形式字符串
     * @return
     */
    public String getTimeFormat(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        return format;
    }



}
