package com.qfedu.dao;

import com.qfedu.entity.Constitution;
import com.qfedu.vo.ResultVo;

import java.util.List;

public interface ConstitutionMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Constitution record);

    int insertSelective(Constitution record);

    Constitution selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Constitution record);

    int updateByPrimaryKey(Constitution record);

    // 查询所有测试体质选项
    List<Constitution> findAllConstitution();

    // 根据ID查询对应的测试对象
    Constitution findConstitutionById(Integer cId);

}