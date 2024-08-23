package com.hxzy.demo.flowhttpserver.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeviceFlow implements Serializable {

    // device serial number
    private String sn;

    // inbound passenger flow
    private Long in;

    // outbound passenger flow
    private Long out;

    /** Number of people passing by */
    private Long passby;

    /** Number of people returning */
    private Long turnback;

    /** Number of adults entering during the current upload period */
    private Long inAdult;

    /** Number of departing adults during the current upload period */
    private Long outAdult;

    /** Number of adults who have passed during the current upload period*/
    private Long passbyAdult;

    /** Number of returning adults during the current upload period */
    private Long turnbackAdult;

    /** Number of children entering during the current upload period */
    private Long inChild;

    /** Number of children leaving during the current upload period */
    private Long outChild;

    /** Number of children passing through during the current upload period */
    private Long passbyChild;

    /** Number of returned children during the current upload period */
    private Long turnbackChild;

    /** Statistics start time, Unix timestamp, seconds */
    private String startFlow;

    /** Statistical end time, Unix timestamp, seconds */
    private String endFlow;

    /** average length of stay*/
    private String avgStayTime;

    /**  Test Line ID */
    private Long regionId;

    /**  Number of employees */
    private Long inStaff;

    /**  Number of employees contributing */
    private Long outStaff;

    /**  Number of employees passing by */
    private Long passbyStaff;

    /**  Number of employees returned */
    private Long turnbackStaff;

    /** maximum dwell time  */
    private Long maxStayTime;

    /** Average length of stay for children  */
    private Long childAvgStayTime;

    /** Maximum stay time for children  */
    private Long childMaxStayTime;

    /**  Average employee stay time */
    private Long staffAvgStayTime;

    /**  Maximum employee stay time */
    private Long staffMaxStayTime;

}
