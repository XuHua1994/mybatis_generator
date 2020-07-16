package com.example.common;

public class ResultBean {
    private Boolean status;
    private String msg;
    private Object data;

    public static ResultBean build() {
        return new ResultBean();
    }

    public static ResultBean ok(String msg) {
        return new ResultBean(true, msg, null);
    }

    public static ResultBean ok(String msg, Object data) {
        return new ResultBean(true, msg, data);
    }

    public static ResultBean error(String msg) {
        return new ResultBean(false, msg, null);
    }

    public static ResultBean error(String msg, Object data) {
        return new ResultBean(false, msg, data);
    }

    private ResultBean() {
    }

    private ResultBean(Boolean status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public ResultBean setStatus(Boolean status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultBean setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getdata() {
        return data;
    }

    public ResultBean setdata(Object data) {
        this.data = data;
        return this;
    }
}
