package com.qfedu.dao;

import com.qfedu.entity.TGood;

public interface TGoodMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TGood record);

    int insertSelective(TGood record);

    TGood selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TGood record);

    int updateByPrimaryKey(TGood record);
}