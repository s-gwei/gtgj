package com.sun.controller;

import com.sun.pojo.StationVo;
import com.sun.service.TrainQueryService;
import com.sun.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author sungw
 * @Date 2023/2/26 20:19
 **/
@RestController("train/query")
public class TrainQueryController {


    @Autowired
    private TrainQueryService trainQueryService;


    @GetMapping("/getAllCity")
    @ResponseBody
    public Result getAllCity(){
        List<StationVo> list = trainQueryService.getAllCity();
        return null;
    }
}
