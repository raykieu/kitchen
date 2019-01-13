package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface VipInfoShowService {

    ResultVo findVipInfoById (Integer id);

    ResultVo findVipTypeByTitle (String title);
}
