package com.qfedu.dao;

import com.qfedu.entity.Sport;

public interface SportMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Sport record);

    int insertSelective(Sport record);

    Sport selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Sport record);

    int updateByPrimaryKey(Sport record);
}