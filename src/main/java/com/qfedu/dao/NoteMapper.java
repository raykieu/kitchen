package com.qfedu.dao;

import com.qfedu.entity.Note;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface NoteMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Note record);

    int insertSelective(Note record);

    Note selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Note record);

    int updateByPrimaryKey(Note record);

    Note findNoteByUid(Integer uId);


}