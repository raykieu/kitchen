package com.qfedu.dao;

import com.qfedu.entity.Constitution;

public interface ConstitutionMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Constitution record);

    int insertSelective(Constitution record);

    Constitution selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Constitution record);

    int updateByPrimaryKey(Constitution record);
}