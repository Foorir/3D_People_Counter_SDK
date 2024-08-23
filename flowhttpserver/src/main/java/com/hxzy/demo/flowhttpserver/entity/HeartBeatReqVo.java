package com.hxzy.demo.flowhttpserver.entity;


import lombok.Data;


@Data
public class HeartBeatReqVo {

    // device serial number
    private String sn;

    // Upload time, Unix timestamp, seconds
    private Long time;

}
