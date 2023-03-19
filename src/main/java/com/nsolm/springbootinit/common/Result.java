package com.nsolm.springbootinit.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 通用返回类
 *
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private int code;

    private T data;

    private String message;

    public Result(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Result(int code, T data) {
        this(code, data, "");
    }

    public Result(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }

    public static Result success(Object data){
        Result result = new Result(ErrorCode.SUCCESS);
        result.setData(data);
        return result;
    }
}
