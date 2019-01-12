package com.qfedu.service;

import com.qfedu.entity.TGoodorder;
import com.qfedu.vo.PageBeanVo;

public interface GoodsOrderService {
    PageBeanVo queryPage(int page, int limit);
}
