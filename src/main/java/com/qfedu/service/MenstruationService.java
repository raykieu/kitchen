package com.qfedu.service;

import com.qfedu.entity.t_menstruation;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;


public interface MenstruationService {
    PageBeanVo queryPage(int page, int limit);

    ResultVo addmentruation(t_menstruation menstruation);

    ResultVo updatementruation(t_menstruation menstruation);

    ResultVo selectByMid(Integer mid);

}
