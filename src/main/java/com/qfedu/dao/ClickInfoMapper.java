package com.qfedu.dao;


import com.qfedu.entity.ClickInfo;

public interface ClickInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClickInfo record);

    int insertSelective(ClickInfo record);

    ClickInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClickInfo record);

    int updateByPrimaryKey(ClickInfo record);
}