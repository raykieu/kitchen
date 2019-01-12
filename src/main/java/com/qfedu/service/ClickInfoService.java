package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface ClickInfoService {

    //通过id超看本条数据
    ResultVo findSingleInfo(Integer id);
    //收藏量加一
    ResultVo collectCountAuto(Integer id);
    //点赞量加一
    ResultVo likeCountAuto(Integer id);
    //播放量加一
    ResultVo playCountAuto(Integer id);
    //浏览量加一
    ResultVo lookCountAuto(Integer id);

    //收藏量减一
    ResultVo collectCountReduce(Integer id);
    //点赞量减一
    ResultVo likeCountReduce(Integer id);
    //播放量减一
    ResultVo playCountRedecu(Integer id);

}
