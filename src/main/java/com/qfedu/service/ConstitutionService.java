package com.qfedu.service;

import com.qfedu.entity.Constitution;
import com.qfedu.vo.ResultVo;

public interface ConstitutionService {

    ResultVo findAllCon();

    ResultVo add(Constitution con);

    ResultVo update(Constitution con);

    ResultVo finById(Integer cId);

    ResultVo delete(Constitution con);

    ResultVo addOption(Constitution con);
}
