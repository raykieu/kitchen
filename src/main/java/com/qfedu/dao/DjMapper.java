package com.qfedu.dao;

import com.qfedu.entity.Dj;

public interface DjMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dj record);

    int insertSelective(Dj record);

    Dj selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dj record);

    int updateByPrimaryKey(Dj record);
}