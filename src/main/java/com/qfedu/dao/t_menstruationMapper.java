package com.qfedu.dao;

import com.qfedu.entity.t_menstruation;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface t_menstruationMapper {
    int deleteByPrimaryKey(Long mid);

    int insert(t_menstruation record);

    int insertSelective(t_menstruation record);

    t_menstruation selectByPrimaryKey(Long mid);

    int updateByPrimaryKeySelective(t_menstruation record);

    int updateByPrimaryKey(t_menstruation record);
//   @Select("SELECT t.`Mid`,t.`recently`,t.`Menstrual_cycle` menstrualCycle,t.`Menstrual_days` menstrualDays FROM t_menstruation t ORDER BY t.`Mid` LIMIT #{index},#{limit}")
//   @ResultType(t_menstruation.class)
    List<t_menstruation> selectAll(Map<String, Object> param);
    @Select("select count(*) from t_menstruation")
    @ResultType(int.class)
    int selectCount();

}