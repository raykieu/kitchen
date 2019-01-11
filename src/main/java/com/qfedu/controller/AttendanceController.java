package com.qfedu.controller;

import com.qfedu.entity.Attendance;
import com.qfedu.service.AttendanceService;
import com.qfedu.service.ConstitutionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是签到红包的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class AttendanceController {

    @Autowired(required = true)
    private AttendanceService attService;

    /**
     * 查询指定用户对应的签到记录
     * @param qUid 关联的用户ID
     * @return  签到的信息
     */
    @ApiOperation("响应登陆用户对应所有的签到数据")
    @GetMapping("findAllAttendacne.do")
    ResultVo findAllAttendacne(@ApiParam("传入qUid") Integer qUid) {
      return attService.findAllAttendance(qUid);
    }

    @ApiOperation("响应登陆用户的见签到情况进行签到数据")
    @GetMapping("addAttendacne.do")
    ResultVo addAttendacne(@ApiParam("传入qUid") Attendance att) { return  attService.addAllAttendance(att); }
}
