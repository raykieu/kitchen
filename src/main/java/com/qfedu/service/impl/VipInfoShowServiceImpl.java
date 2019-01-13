/**
 * FileName: VipInfoShowServiceImpl
 * Author:   wyr
 * Date:     2019/1/13 15:39
 * Description:
 */

package com.qfedu.service.impl;

import com.qfedu.dao.VipInfoShowMapper;
import com.qfedu.service.VipInfoShowService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.VipInfoShowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VipInfoShowServiceImpl implements VipInfoShowService {

    @Autowired
    private VipInfoShowMapper vipInfoShowMapperDao;

    @Override
    public ResultVo findVipInfoById(Integer id) {
        List<VipInfoShowVo> list = new ArrayList();
        list = vipInfoShowMapperDao.selectAllInfoByTypeId(id);
        if( list != null){
            return  ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo findVipTypeByTitle(String title) {
        List<VipInfoShowVo> list = new ArrayList();
        list = vipInfoShowMapperDao.selectInfoByTitle(title);
        if( list != null){
            return  ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR();
        }
    }

}
