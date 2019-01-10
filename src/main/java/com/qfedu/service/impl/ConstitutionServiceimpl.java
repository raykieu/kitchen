package com.qfedu.service.impl;

import com.qfedu.dao.ConstitutionMapper;
import com.qfedu.dao.OptionMapper;
import com.qfedu.entity.Constitution;
import com.qfedu.entity.Option;
import com.qfedu.service.ConstitutionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstitutionServiceimpl implements ConstitutionService {

    @Autowired(required = true)
    private ConstitutionMapper condao;

    @Autowired(required = true)
    private OptionMapper opDao;

    @Override
    public ResultVo findAllCon() {
        List<Constitution> list = condao.findAllConstitution();
        if (list.size() != 0) {
            return ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo add(Constitution con) {
        if (condao.insertSelective(con) > 0) {
            ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo update(Constitution con) {
        Constitution con1 = condao.findConstitutionById(con.getcId());
        if (con1 != null) {
            con1.setcInfo(con.getcInfo());
            con1.setcResult(con.getcResult());
            con1.setcResultInfo(con.getcResultInfo());
            condao.updateByPrimaryKeySelective(con1);
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo finById(Integer cId) {
        Constitution con = condao.findConstitutionById(cId);
        if (con != null) {
            return ResultVo.setOK(con);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo delete(Constitution con) {
        Constitution con1 = condao.findConstitutionById(con.getcId());
        if (con1 != null) {
            if (con.getcId() == 0) {
                con1.setcId(1);
                condao.updateByPrimaryKeySelective(con1);
                return ResultVo.setOK(null);
            }
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo addOption(Constitution con) {
        List<Option> list = opDao.findAllOption();

        return null;
    }

}
