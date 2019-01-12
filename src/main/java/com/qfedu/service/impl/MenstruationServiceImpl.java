package com.qfedu.service.impl;

import com.qfedu.dao.t_menstruationMapper;
import com.qfedu.entity.t_menstruation;
import com.qfedu.service.MenstruationService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MenstruationServiceImpl implements MenstruationService {

    @Autowired(required = true)
    private t_menstruationMapper menstruationdao;
    @Override
    public PageBeanVo<t_menstruation> queryPage(int page, int limit) {
        Map<String,Object> map=new HashedMap();
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(menstruationdao.selectCount(), menstruationdao.selectAll(map));
    }

    @Override
    public ResultVo addmentruation(t_menstruation menstruation) {
        int i = menstruationdao.insertSelective(menstruation);
        if (i>0){
            return ResultVo.setOK(null);
        }else{
            return  ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo updatementruation(t_menstruation menstruation) {
        int i = menstruationdao.updateByPrimaryKeySelective(menstruation);
        if (i>0){
            return ResultVo.setOK("更新成功");
        }else {
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo selectByMid(Integer mid) {
        t_menstruation menstruation = menstruationdao.selectByMid(mid);
        if (menstruation!=null){
            return ResultVo.setOK(menstruation);
        }else {
            return  ResultVo.setERROR();
        }

    }
}
