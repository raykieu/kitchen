package com.qfedu.dao;

import com.qfedu.entity.Note;
import com.qfedu.entity.Noteimag;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface NoteimagMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(Noteimag record);

    int insertSelective(Noteimag record);

    Noteimag selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(Noteimag record);

    int updateByPrimaryKey(Noteimag record);

    List<Note> findAllNote(Map<String,Object> map);

    // 查看总数
    @Select("select count(*) from noteimag")
    @ResultType(int.class)
    int selectCount();

}