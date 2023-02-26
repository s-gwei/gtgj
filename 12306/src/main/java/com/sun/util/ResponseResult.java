package com.sun.util;

/**
 * @Author sungw
 * @Date 2023/2/26 20:32
 **/
public class ResponseResult<T> {
    private long code;
    private String message;
    private T data;

    protected ResponseResult() {
    }

    protected ResponseResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

//    /**
//     * 成功返回结果
//     *
//     * @param data 获取的数据
//     */
//    public static <T> ResponseResult<T> success(T data) {
//        return new ResponseResult<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
//    }
//
//    /**
//     * 成功返回结果
//     *
//     * @param data 获取的数据
//     * @param  message 提示信息
//     */
//    public static <T> ResponseResult<T> success(T data, String message) {
//        return new ResponseResult<T>(ResultCode.SUCCESS.getCode(), message, data);
//    }
//
//    /**
//     * 失败返回结果
//     * @param errorCode 错误码
//     */
//    public static <T> ResponseResult<T> failed(IErrorCode errorCode) {
//        return new ResponseResult<T>(errorCode.getCode(), errorCode.getMessage(), null);
//    }
//
//    /**
//     * 失败返回结果
//     * @param message 提示信息
//     */
//    public static <T> ResponseResult<T> failed(String message) {
//        return new ResponseResult<T>(ResultCode.FAILED.getCode(), message, null);
//    }
//
//    /**
//     * 失败返回结果
//     */
//    public static <T> ResponseResult<T> failed() {
//        return failed(ResultCode.FAILED);
//    }
//
//    /**
//     * 参数验证失败返回结果
//     */
//    public static <T> ResponseResult<T> validateFailed() {
//        return failed(ResultCode.VALIDATE_FAILED);
//    }
//
//    /**
//     * 参数验证失败返回结果
//     * @param message 提示信息
//     */
//    public static <T> ResponseResult<T> validateFailed(String message) {
//        return new ResponseResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
//    }
//
//    /**
//     * 未登录返回结果
//     */
//    public static <T> ResponseResult<T> unauthorized(T data) {
//        return new ResponseResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
//    }
//
//    /**
//     * 未授权返回结果
//     */
//    public static <T> ResponseResult<T> forbidden(T data) {
//        return new ResponseResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
//    }
//
//    public long getCode() {
//        return code;
//    }
//
//    public void setCode(long code) {
//        this.code = code;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
}
