package com.qfedu.service.impl;

import com.qfedu.dao.SportMapper;
import com.qfedu.dao.SportimgMapper;
import com.qfedu.entity.Sport;
import com.qfedu.entity.Sportimg;
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

    @Autowired(required = true)
    private SportimgMapper spoDao;

    @Override
    public PageBeanVo findAllSport(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);

        return PageBeanVo.setPage(sportDao.sportCount(),sportDao.findAllSports(map));
    }

    @Override
    public ResultVo add(Sport sp) {
        if (sportDao.insert(sp) > 0) {
            return ResultVo.setOK(null);
        }
        Sportimg spo = new Sportimg();
        spo.setiImgurl(sp.getGoushi());
        spo.setsId(sp.getsId());
        if (spoDao.insertSelective(spo) > 0) {
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo delete(int sId) {
        if (sportDao.deleteByPrimaryKey(sId) > 0){
            return ResultVo.setOK("OK");
        }
        return ResultVo.setERROR();
    }

    @Override
    public Sport findSportById(int sId) {
        Sport sp = sportDao.findeBySportByid(sId);
        return sp;
    }

    @Override
    public ResultVo update(Sport sp) {
        if (sportDao.updateByPrimaryKeySelective(sp) > 0) {
            return ResultVo.setOK(null);
        }
        Sportimg spo = new Sportimg();
        spo.setiImgurl(sp.getGoushi());
        spo.setsId(sp.getsId());
        if (spoDao.updateByPrimaryKey(spo) > 0) {
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

}
