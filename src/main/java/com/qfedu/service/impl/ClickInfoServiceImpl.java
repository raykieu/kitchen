/**
 * FileName: ClickInfoServiceImpl
 * Author:   wyr
 * Date:     2019/1/10 17:17
 * Description:
 */

package com.qfedu.service.impl;

import com.qfedu.dao.ClickInfoMapper;
import com.qfedu.service.ClickInfoService;
import com.qfedu.vo.ResultVo;
import com.qfedu.vo.TwoMenuInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClickInfoServiceImpl implements ClickInfoService {

    @Autowired
    private ClickInfoMapper clickInfoDao;

    @Override
    public ResultVo findSingleInfo(Integer id) {
        if (id != null){
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }else {
            return ResultVo.setERROR();
        }
    }

    @Override
    public ResultVo collectCountAuto(Integer id) {
        //通过该条数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //收藏+1
        int j = clickInfoDao.updateCollectCountById(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo likeCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //点赞+1
        int j = clickInfoDao.updateLikeCountById(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }
    @Override
    public ResultVo playCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //播放+1
        int j = clickInfoDao.updatePlayCountById(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo lookCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //播放+1
        int j = clickInfoDao.updateLookCountById(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo collectCountReduce(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //收藏-1
        int j = clickInfoDao.updateCollectCountById2(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo likeCountReduce(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //点赞-1
        int j = clickInfoDao.updateLikeCountById2(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo playCountRedecu(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectByInfoId(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //播放-1
        int j = clickInfoDao.updatePlayCountById2(clid);
        if (j > 0 ){
            //成功，通过id重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfoId(id));
        }
        return  ResultVo.setERROR();
    }
}
