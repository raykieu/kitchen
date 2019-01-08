package com.qfedu.dao;

import com.qfedu.entity.Sportimg;

public interface SportimgMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Sportimg record);

    int insertSelective(Sportimg record);

    Sportimg selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Sportimg record);

    int updateByPrimaryKey(Sportimg record);
}