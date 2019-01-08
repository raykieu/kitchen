package com.qfedu.dao;

import com.qfedu.entity.Foodmenu;

public interface FoodmenuMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Foodmenu record);

    int insertSelective(Foodmenu record);

    Foodmenu selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Foodmenu record);

    int updateByPrimaryKey(Foodmenu record);
}