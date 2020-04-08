package com.liudegui.model;


import com.liudegui.base.Constant;

public class MessageModel {
    private Integer code= Constant.OPS_SUCCESS_DODE;
    private String msg=Constant.OPS_SUCCESS_MSG;
    private Object result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
