/**
 * FileName: IndexListInfoServiceIml
 * Author:   wyr
 * Date:     2019/1/10 17:05
 * Description:
 */

package com.qfedu.service.impl;

import com.qfedu.dao.ClickInfoMapper;
import com.qfedu.service.IndexListInfoService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.TwoMenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IndexListInfoServiceIml implements IndexListInfoService {

    @Autowired
    private ClickInfoMapper clickInfoDao;

    @Override
    public ResultVo findSingleInfo(String info) {
        TwoMenuInfo twoMenuInfo = clickInfoDao.selectByInfo(info);
        return ResultVo.setOK(twoMenuInfo);
    }

    @Override
    public ResultVo findSingleInfo2(Integer id) {
        TwoMenuInfo twoMenuInfo = clickInfoDao.selectById(id);
        return ResultVo.setOK(twoMenuInfo);
    }


}
