package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface IndexListTwoService {

    //通过种类id查找全部信息 点击烘培/素食主义/煲汤/本周佳作
    ResultVo findAllMenuInfo(Integer id );
    //烘培 模糊查询
    ResultVo findBake(String title);
    //素食主义 模糊查询
    ResultVo findVegetarianism(String title);
    //煲汤 模糊查询
    ResultVo findCookSoup (String title );
    //本周佳作 模糊查询
    ResultVo findMerit (String title);

    //首页顶部搜索框，模糊查询
    ResultVo SearchMenuInfo(String title);
}