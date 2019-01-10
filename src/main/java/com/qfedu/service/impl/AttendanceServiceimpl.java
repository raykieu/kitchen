package com.qfedu.service.impl;

import com.qfedu.dao.AttendanceMapper;
import com.qfedu.entity.Attendance;
import com.qfedu.service.AttendanceService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class AttendanceServiceimpl implements AttendanceService {

    @Autowired
    private AttendanceMapper attDao;

    @Override
    public ResultVo findAllAttendance(Integer qUid) {
        Attendance User = attDao.findAllAttendance(qUid);
        if (User != null) {
            return ResultVo.setOK(User);
        }

        return ResultVo.setERROR();
    }

    @Override
    public ResultVo addAllAttendance(Attendance attend) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String format = sdf.format(today);
        int i = Integer.parseInt(format);
        Attendance att = attDao.findAllAttendance(attend.getqUid());
        if (att == null) {
            attend.setqCount(1);
            attend.setqContinuesign(1);
            attend.setqCreatetime(today);
            attend.setqUpdatetime(today);
            attend.setqUid(2);
           if (attDao.insertSelective(attend) > 0){
               return ResultVo.setOK(null);
           }
        }
        if (att.getqCount() > 0) {
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
            attend.setqUpdatetime(today);
            attDao.updateByPrimaryKeySelective(attend);
            String format2 = sdf1.format(att.getqCreatetime());
            String format3 = sdf1.format(att.getqUpdatetime());
            int aaa = Integer.parseInt(format2);
            int bbb = Integer.parseInt(format3);

            if (aaa - bbb == 0 ){
                System.out.println("今天已经签到，请明天签");
                return ResultVo.setERROR();
            }
        }
        if (att.getqContinuesign() > 0) {
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
            Date date1 = att.getqUpdatetime();
            String format1 = sdf2.format(date1);

            int i1 = Integer.parseInt(format1);
            if (i - i1 > 1){
                att.setqContinuesign(0);
                attDao.updateByPrimaryKeySelective(att);
                return ResultVo.setOK(null);
            }
        }
        if (att.getqContinuesign() > 0){
            if (att.getqContinuesign() < 6 ) {
                att.setqCount(att.getqCount() + 1);
                att.setqContinuesign(att.getqContinuesign() + 1);
                attDao.updateByPrimaryKeySelective(att);
            }
            if (att.getqContinuesign() == 6) {
                System.out.println("领奖金方法");
                att.setqContinuesign(0);
                att.setqCount(att.getqCount() + 1);
                attDao.updateByPrimaryKeySelective(att);
            }
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }
}
