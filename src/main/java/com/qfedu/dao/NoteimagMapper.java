package com.qfedu.dao;

import com.qfedu.entity.Noteimag;

public interface NoteimagMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Noteimag record);

    int insertSelective(Noteimag record);

    Noteimag selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Noteimag record);

    int updateByPrimaryKey(Noteimag record);
}