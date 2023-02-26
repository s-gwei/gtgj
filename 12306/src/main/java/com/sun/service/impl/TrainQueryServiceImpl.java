package com.sun.service.impl;

import com.sun.pojo.StationVo;
import com.sun.service.TrainQueryService;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Target;
import java.util.List;

/**
 * @Author sungw
 * @Date 2023/2/26 20:39
 **/
@Repository
public class TrainQueryServiceImpl implements TrainQueryService {
    @Override
    public List<StationVo> getAllCity() {
        return null;
    }
}
