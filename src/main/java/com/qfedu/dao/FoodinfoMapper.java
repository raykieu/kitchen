package com.qfedu.dao;

import com.qfedu.entity.Foodinfo;

public interface FoodinfoMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Foodinfo record);

    int insertSelective(Foodinfo record);

    Foodinfo selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Foodinfo record);

    int updateByPrimaryKey(Foodinfo record);
}