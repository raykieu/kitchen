package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface IndexListInfoService {

    //查找一条具体的数据,通过标题
    ResultVo findSingleInfo (String title);
    //查找一条具体的数据 通过id
    ResultVo findSingleInfo2 (Integer id);
}
