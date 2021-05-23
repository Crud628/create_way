package com.wkcto.vo;

public class Result {
    // code=0 成功； code =1 失败
    private int code;
    //表示错误码
    private int error;
    //消息文本
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
