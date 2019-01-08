package com.qfedu.service;

import com.qfedu.vo.PageBeanVo;


public interface MenstruationService {
    PageBeanVo queryPage(int page, int limit);

}
