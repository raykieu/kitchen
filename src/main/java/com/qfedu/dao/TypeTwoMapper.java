package com.qfedu.dao;

import com.qfedu.entity.TypeTwo;

public interface TypeTwoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TypeTwo record);

    int insertSelective(TypeTwo record);

    TypeTwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TypeTwo record);

    int updateByPrimaryKey(TypeTwo record);
}