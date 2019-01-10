package com.qfedu.service;

import com.qfedu.entity.Attendance;
import com.qfedu.vo.ResultVo;

public interface AttendanceService {

    ResultVo findAllAttendance(Integer qUid);

    ResultVo addAllAttendance(Attendance attend);
}
