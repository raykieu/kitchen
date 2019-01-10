package com.qfedu.dao;

import com.qfedu.entity.Option;

import java.util.List;

public interface OptionMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Integer oId);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);

    List<Option> findAllOption();
}