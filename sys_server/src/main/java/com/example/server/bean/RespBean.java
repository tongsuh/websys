package com.example.server.bean;

/**
 * Created by sang on 2017/12/17.
 * 一个容器，包含状态和信息两个属性，是个对象
 */
public class RespBean {
    private String status;
    private String msg;

    public RespBean() {
    }
//构造方法
    public RespBean(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
