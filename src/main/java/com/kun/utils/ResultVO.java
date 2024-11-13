package com.kun.utils;

import lombok.Data;

/**
 * @author Teemo
 */
@Data
public class ResultVO<T> {
    private Boolean success;
    private String message;
    private T data;

    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setSuccess(true);
        resultVO.setData(data);
        return resultVO;
    }

    public static <T> ResultVO<T> success() {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setSuccess(true);
        return resultVO;
    }

    public static <T> ResultVO<T> fail(T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setSuccess(false);
        resultVO.setData(data);
        return resultVO;
    }

    public static <T> ResultVO<T> fail() {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setSuccess(false);
        return resultVO;
    }
}
