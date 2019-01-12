package com.qfedu.dao;

import com.qfedu.entity.TGoodorder;

public interface TGoodorderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TGoodorder record);

    int insertSelective(TGoodorder record);

    TGoodorder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TGoodorder record);

    int updateByPrimaryKey(TGoodorder record);
}