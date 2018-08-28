package com.imooc.miaosha.result;

public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(CodeMsg data) {
        if(data==null){
            return;
        }
        this.code= data.getCode();
        this.msg = data.getMsg();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    private Result(){}
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;

    }

    public static <T> Result<T> success(T data){
        return  new Result<T>(data);
    }
    public static <T> Result<T> error(CodeMsg data){
        return  new Result<T>(data);
    }

    public Result(T data) {
        this.data = data;
        this.code= 0;

    }
}
