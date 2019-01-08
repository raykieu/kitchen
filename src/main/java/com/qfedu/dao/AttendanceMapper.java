package com.qfedu.dao;

import com.qfedu.entity.Attendance;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer qId);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer qId);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}