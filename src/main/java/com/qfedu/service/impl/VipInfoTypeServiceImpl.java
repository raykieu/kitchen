/**
 * FileName: VipInfoTypeServiceImpl
 * Author:   wyr
 * Date:     2019/1/13 15:20
 * Description:
 */

package com.qfedu.service.impl;

import com.qfedu.dao.VipInfoTypeMapper;
import com.qfedu.entity.VipInfoType;
import com.qfedu.service.VipInfoTypeService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VipInfoTypeServiceImpl implements VipInfoTypeService {

    @Autowired
    private VipInfoTypeMapper vipInfoTypeMapperDao;

    @Override
    public ResultVo findVipType() {
        if (vipInfoTypeMapperDao.selectAllType()!=null){
            return ResultVo.setOK(vipInfoTypeMapperDao.selectAllType());
        }else {
            return ResultVo.setERROR();
        }
    }
}
