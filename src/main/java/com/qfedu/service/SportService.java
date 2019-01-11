package com.qfedu.service;

import com.qfedu.vo.PageBeanVo;

public interface SportService {

    PageBeanVo findAllSport(Integer page, Integer limit);

}
