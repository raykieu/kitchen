package com.qfedu.service.impl;

import com.qfedu.dao.OptionMapper;
import com.qfedu.entity.Option;
import com.qfedu.service.OptionService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceimpl implements OptionService {

    @Autowired(required = true)
    private OptionMapper opDao;

    @Override
    public ResultVo findAllOption() {
        List<Option> list = opDao.findAllOption();
        if (list.size() != 0) {
            return  ResultVo.setOK(list);
        }
        return ResultVo.setERROR();
    }
}
