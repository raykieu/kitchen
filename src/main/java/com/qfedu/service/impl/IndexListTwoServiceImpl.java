/**
 * FileName: IndexListTwoServiceImpl
 * Author:   wyr
 * Date:     2019/1/9 11:34
 * Description:
 */

package com.qfedu.service.impl;

import com.qfedu.dao.IndexListMapper;
import com.qfedu.service.IndexListTwoService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.TwoMenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexListTwoServiceImpl implements IndexListTwoService {
    @Autowired
    private IndexListMapper indexlistMapperDao;

    @Override
    public ResultVo findMenuInfoTwo(Integer id) {
        List<TwoMenuInfo> list = indexlistMapperDao.selectByAllType(id);
        return  ResultVo.setOK(list);
    }
    //本周佳作
    @Override
    public ResultVo findMerit (String title){
        List<TwoMenuInfo> list = indexlistMapperDao.selectByType1(title);
        return ResultVo.setOK(list);
    }



    //烘培
    @Override
    public ResultVo findBake(String title ){
        List<TwoMenuInfo> list = indexlistMapperDao.selectByType2(title);
        return  ResultVo.setOK(list);
    }
    //煲汤
    @Override
    public ResultVo findCookSoup (String title ){
        List<TwoMenuInfo> list = indexlistMapperDao.selectByType3(title);
        return ResultVo.setOK(list);
    }
    //素食主义
    @Override
    public ResultVo findVegetarianism(String title){
        List<TwoMenuInfo> list = indexlistMapperDao.selectByType4(title);
        return ResultVo.setOK(list);
    }

    //首页顶部搜索框，模糊查询
    @Override
    public ResultVo findMenuInfoByTitle(String title) {
        List<TwoMenuInfo> list = indexlistMapperDao.selectMenuInfoByTitle(title);
        return ResultVo.setOK(list);
    }
}
