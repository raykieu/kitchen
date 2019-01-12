package com.qfedu.service;

import com.qfedu.entity.Foodmenu;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface FoodMenuService {

    PageBeanVo findAllMenu(Integer page,Integer limit);

    ResultVo addMenu(Foodmenu fm);
}
