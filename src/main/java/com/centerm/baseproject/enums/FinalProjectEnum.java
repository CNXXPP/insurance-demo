package com.centerm.baseproject.enums;

import com.centerm.constant.ErrorCode;

public enum FinalProjectEnum implements ErrorCode {
    RECORD_NOT_EXIST(101,"该记录不存在"),
    FILE_NAME_ERROR(102,"文件名格式错误");

    private int code;

    private String msg;

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    FinalProjectEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
