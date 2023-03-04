package com.sun.controller;

import com.sun.result.Result;
import com.sun.result.ResultStatus;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sungw
 * @Date 2023/3/4 15:39
 **/

@Api("测试")
@RestController
public class TestController {

    @ApiOperation("获取用户列表")
    @GetMapping("/success")
    public Result test(){
        return Result.success();
    }

    @PostMapping("/create")
    public Result test1(){
        return Result.success(ResultStatus.CREATE,null);
    }

    @PatchMapping("/bad_request")
    public Result badRequest(){
        return Result.failure(ResultStatus.BAD_REQUEST);
    }
}
