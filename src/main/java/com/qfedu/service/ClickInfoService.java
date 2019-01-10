package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface ClickInfoService {

    //收藏量加一
    ResultVo collectCountAuto(Integer id);
    //点赞量加一
    ResultVo likeCountAuto(Integer id);
    //播放量加一
    ResultVo playCountAuto(Integer id);

}
