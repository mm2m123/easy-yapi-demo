package com.example.demo.Result;



/**
 * @ClassName Result
 * @Description
 * @Date 2019-10-27 10:55
 **/

public class Result<T> {

    /**
     * 状态码 0成功 -1 表示登录失效
     * @Description
     * @date
     */
    private Integer code;

    /**
     * 消息
     * @Description
     * @date
     */
    private String msg;

    /**
     * 封装好的数据
     * @Description
     * @date
     */
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
