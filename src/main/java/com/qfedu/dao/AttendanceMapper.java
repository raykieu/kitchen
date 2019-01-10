package com.qfedu.dao;

import com.qfedu.entity.Attendance;

import java.util.List;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer qId);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer qId);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);

    // 查询用户对应的签到记录
   Attendance findAllAttendance(Integer qUid);
}