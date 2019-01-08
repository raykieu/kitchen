package com.qfedu.dao;

import com.qfedu.entity.IndexList;

public interface IndexListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndexList record);

    int insertSelective(IndexList record);

    IndexList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndexList record);

    int updateByPrimaryKey(IndexList record);
}