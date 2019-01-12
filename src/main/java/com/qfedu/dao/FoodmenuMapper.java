package com.qfedu.dao;

import com.qfedu.entity.Foodmenu;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface FoodmenuMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Foodmenu record);

    int insertSelective(Foodmenu record);

    Foodmenu selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Foodmenu record);

    int updateByPrimaryKey(Foodmenu record);

    @Select("select count(*) from sport")
    @ResultType(Integer.class)
    int MenuCount();

    List<Foodmenu> findAllM(Map<String,Object> map);
}