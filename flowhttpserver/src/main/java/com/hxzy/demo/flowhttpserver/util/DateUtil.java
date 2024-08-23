package com.hxzy.demo.flowhttpserver.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description: TODO
 * @Author Allen
 * @Date 2024/7/9
 * @Version V1.0
 **/
public class DateUtil {

    public static Long dateTimeToLong(String dateTimeStr){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, df);
        return Timestamp.valueOf(dateTime).getTime()/1000;
    }

}
