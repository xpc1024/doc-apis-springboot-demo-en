package com.example.demo.model;

/**
 * Api result
 * <p>
 * Copyright © 2024 xpc1024 All Rights Reserved
 **/
public class ApiResult<T> {
    /**
     * data
     */
    private T data;
    /**
     * code
     */
    private Integer code;
    /**
     * message
     */
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

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

    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> result = new ApiResult<T>();
        result.setCode(200);
        result.setData(data);
        result.setMsg("success");
        return result;
    }

    public static <T> ApiResult<T> success() {
        ApiResult<T> result = new ApiResult<T>();
        result.setCode(200);
        result.setMsg("success");
        return result;
    }

    public static <T> ApiResult<T> error(Integer code, String msg) {
        ApiResult<T> result = new ApiResult<T>();
        result.setCode(code);
        result.setData(null);
        result.setMsg(msg);
        return result;
    }
}
