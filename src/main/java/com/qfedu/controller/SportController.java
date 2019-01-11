package com.qfedu.controller;

import com.qfedu.service.SportService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是健身七分吃的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class SportController {

    @Autowired(required = true)
    private SportService sportSerivce;

    @ApiOperation("响应运动的四条数据数据")
    @GetMapping("find4Sports.do")
    PageBeanVo find4Sports(@ApiParam("这个不用传参") Integer page, Integer limit){
      return sportSerivce.findAllSport(0,4);
    }

    @ApiOperation("响应运动数据数据")
    @GetMapping("findAllSports.do")
    PageBeanVo findAllSports(@ApiParam("传入页码page,个数limit") Integer page, Integer limit){
        return sportSerivce.findAllSport(page,limit);
    }
}
