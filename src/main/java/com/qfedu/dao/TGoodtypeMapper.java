package com.qfedu.dao;

import com.qfedu.entity.TGoodtype;

public interface TGoodtypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TGoodtype record);

    int insertSelective(TGoodtype record);

    TGoodtype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TGoodtype record);

    int updateByPrimaryKey(TGoodtype record);
}