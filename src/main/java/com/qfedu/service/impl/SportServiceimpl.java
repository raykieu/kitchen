package com.qfedu.service.impl;

import com.qfedu.dao.SportMapper;
import com.qfedu.entity.Sport;
import com.qfedu.service.SportService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SportServiceimpl implements SportService {

    @Autowired(required = true)
    private SportMapper sportDao;

    @Override
    public PageBeanVo findAllSport(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("page",(page - 1) * limit);
        map.put("page",limit);

        return PageBeanVo.setPage(sportDao.sportCount(),sportDao.findAllSports(map));
    }
}
