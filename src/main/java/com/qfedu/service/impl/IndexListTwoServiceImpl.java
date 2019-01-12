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
    public ResultVo findAllMenuInfo(Integer id) {
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoAllByTypeId(id);
        if (list != null){
            return ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR();
        }
    }

    //本周佳作
    @Override
    public ResultVo findMerit (String title){
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoByTitle(title);
        if (list != null){
            return  ResultVo.setOK(list);
        }else{
            return  ResultVo.setERROR();
        }
    }

    //烘培
    @Override
    public ResultVo findBake(String title ){
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoByTitle2(title);
        if (list != null){
            return ResultVo.setOK(list);
        }else{
            return ResultVo.setERROR();
        }
    }
    //煲汤
    @Override
    public ResultVo findCookSoup (String title ){
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoByTitle3(title);
        if (list != null){
            return ResultVo.setOK(list);
        }else{
            return ResultVo.setERROR();
        }
    }
    //素食主义
    @Override
    public ResultVo findVegetarianism(String title){
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoByTitle4(title);
        if (list != null){
            return  ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR();
        }
    }

    //首页顶部搜索框，模糊查询
    @Override
    public ResultVo SearchMenuInfo(String title){
        List<TwoMenuInfo> list = indexlistMapperDao.selectInfoAllByTitle(title);
        if (list != null){
            return  ResultVo.setOK(list);
        }else {
            return ResultVo.setERROR();
        }
    }
}
