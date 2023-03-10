package com.atguigu.staservice.controller;


import com.atguigu.commonutils.R;
import com.atguigu.staservice.service.StatisticsDailyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 网站统计日数据 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2021-03-23
 */
@Api(description="统计分析管理")
@RestController
@RequestMapping("/staservice/stadaily")
@CrossOrigin
public class StatisticsDailyController {
    @Autowired
    private StatisticsDailyService dailyService;

    @ApiOperation(value = "生成统计数据")
    @PostMapping("createStaDaily/{day}")
    public R createStaDaily(@PathVariable String day){
        dailyService.createStaDaily(day);
        return R.ok();
    }

}

