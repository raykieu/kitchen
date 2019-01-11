package com.qfedu.dao;

import com.qfedu.entity.Sport;

import java.util.List;
import java.util.Map;

public interface SportMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Sport record);

    int insertSelective(Sport record);

    Sport selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Sport record);

    int updateByPrimaryKey(Sport record);

    List<Sport> findAllSports(Map<String,Object> map);

    int sportCount();
}