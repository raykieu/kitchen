package com.qfedu.service;

import com.qfedu.entity.Sport;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface SportService {

    PageBeanVo findAllSport(Integer page, Integer limit);

    ResultVo add(Sport sp);

    ResultVo delete(int sId);

    Sport findSportById(int sId);

    ResultVo update(Sport sp);
}
