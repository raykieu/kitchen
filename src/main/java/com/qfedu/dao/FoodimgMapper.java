package com.qfedu.dao;

import com.qfedu.entity.Foodimg;

public interface FoodimgMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Foodimg record);

    int insertSelective(Foodimg record);

    Foodimg selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Foodimg record);

    int updateByPrimaryKey(Foodimg record);
}