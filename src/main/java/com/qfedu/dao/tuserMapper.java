package com.qfedu.dao;

import com.qfedu.entity.tuser;

public interface tuserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(tuser record);

    int insertSelective(tuser record);

    tuser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(tuser record);

    int updateByPrimaryKey(tuser record);

    tuser selectByName(String username);
}