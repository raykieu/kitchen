package com.qfedu.service.impl;

import com.qfedu.dao.FoodmenuMapper;
import com.qfedu.dao.tuserMapper;
import com.qfedu.entity.Foodmenu;
import com.qfedu.entity.tuser;
import com.qfedu.service.FoodMenuService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FoodMenuServiceimpl implements FoodMenuService {

    @Autowired
    private FoodmenuMapper foodDao;

    @Autowired
    private tuserMapper tuserdao;


    @Override
    public PageBeanVo findAllMenu(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(foodDao.MenuCount(),foodDao.findAllM(map));
    }

    @Override
    public ResultVo addMenu(Foodmenu fm) {
        if (foodDao.insertSelective(fm) > 0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }
}
