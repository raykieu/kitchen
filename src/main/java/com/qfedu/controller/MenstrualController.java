package com.qfedu.controller;

import com.qfedu.entity.t_menstruation;
import com.qfedu.service.MenstruationService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class MenstrualController {

    @Autowired(required = true)
    private MenstruationService menstruationService;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"经期分页"},value = "获取名次接口")
    @GetMapping("/menstruation.do")
    public PageBeanVo<t_menstruation> all(int page, int limit) {
        return menstruationService.queryPage(page, limit);
    }
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"传入经期时间"},value = "输入周期，天数，最近一次月经是哪天 用户ID")
    @PostMapping("addmenstruation.do")
    public ResultVo addmenstruation(long mid, String menstrualCycle, String menstrualDays, Date recently ){
            t_menstruation menstruation=new t_menstruation();
        menstruation.setMenstrualCycle(Integer.parseInt(menstrualCycle));
        menstruation.setMenstrualDays(Integer.parseInt(menstrualDays));
        menstruation.setRecently(recently);
        menstruation.setMid(mid);

        return  menstruationService.addmentruation(menstruation);
    }
    @ApiOperation(notes = "用户设置的经期参数",tags = {"用户的三个参数"},value ="利用MID更新周期，天数，最近一次月经是哪天" )
    @PostMapping("updatemenstruation.do")
    public ResultVo update(t_menstruation menstruation ){
//        t_menstruation menstruation=new t_menstruation();
//        menstruation.setMenstrualCycle(Integer.parseInt(menstrualCycle));
//        menstruation.setMenstrualDays(Integer.parseInt(menstrualDays));
//        menstruation.setRecently(recently);
//        menstruation.setMid((long) uid);
        ResultVo updatementruation = menstruationService.updatementruation(menstruation);

        return  updatementruation;

    }
    @ApiOperation(notes = "用户经期特殊日期的显示",tags = {"用户的Uid"},value ="利用UID显示周期，天数，最近一次月经是哪天" )
    @PostMapping("selectByIdmenstruation.do")
    public  ResultVo selectById(long uid){

        ResultVo resultVo = menstruationService.selectByMid((int) uid);

        return  resultVo;

    }

}
