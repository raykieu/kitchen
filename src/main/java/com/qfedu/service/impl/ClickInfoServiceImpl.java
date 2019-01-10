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
    public ResultVo collectCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id );
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //收藏+1
        int j = clickInfoDao.updateCollectCountById(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo likeCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //点赞+1
        int j = clickInfoDao.updateLikeCountById(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }
    @Override
    public ResultVo playCountAuto(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //播放+1
        int j = clickInfoDao.updatePlayCountById(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo collectCountReduce(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //收藏-1
        int j = clickInfoDao.updateCollectCountById2(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo likeCountReduce(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //点赞-1
        int j = clickInfoDao.updateLikeCountById2(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo playCountRedecu(Integer id) {
        //通过数据的id获取该条数据的信息
        TwoMenuInfo t = clickInfoDao.selectById(id);
        //得到该条数据的clid
        int clid = t.getClid();
        //得到该条数据的info
        String info = t.getInfo();
        //播放-1
        int j = clickInfoDao.updatePlayCountById2(clid);
        if (j > 0 ){
            //成功，通过info重新查询该数据的最新信息，返回
            return ResultVo.setOK(clickInfoDao.selectByInfo(info));
        }
        return  ResultVo.setERROR();
    }
}
