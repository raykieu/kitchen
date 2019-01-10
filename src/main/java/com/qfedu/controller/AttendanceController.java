package com.qfedu.controller;

import com.qfedu.entity.Attendance;
import com.qfedu.service.AttendanceService;
import com.qfedu.service.ConstitutionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("findAllAttendacne")
    ResultVo findAllAttendacne(Integer qUid) {
      return attService.findAllAttendance(qUid);
    }

    @GetMapping("addAttendacne.do")
    ResultVo addAttendacne(Attendance att) { return  attService.addAllAttendance(att); }
}
