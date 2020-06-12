package com.ufs.data.ufsdata.model.meta;

import lombok.Data;

/**
 * @author Winston.xu
 * @date 2020/6/12
 */
@Data
public class ErrorInfo<T> {

    public static final Integer OK = 200;
    public static final Integer ERROR = 500;

    private Integer code;

    private T data;

    private boolean success;

    private String url;

    private String message;
}
