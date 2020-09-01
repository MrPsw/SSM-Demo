package cn.itcast.result;

import cn.itcast.error.ServerError;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {

    private int code;
    private String msg;
    private T data;


    public BaseResult() {
        this.msg = ServerError.getErrorMsg(code);
    }

    public BaseResult(int code) {
        this.code = code;
        this.msg = ServerError.getErrorMsg(code);
    }

    public BaseResult(T data) {
        this.msg = ServerError.getErrorMsg(code);
        this.data = data;
    }

    public BaseResult(int code, T data) {
        this.code = code;
        this.msg = ServerError.getErrorMsg(code);
        this.data = data;
    }


    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
