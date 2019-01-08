package com.qfedu.dao;

import com.qfedu.entity.Menutypetbl;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenutypetblMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Menutypetbl record);

    int insertSelective(Menutypetbl record);

    Menutypetbl selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Menutypetbl record);

    int updateByPrimaryKey(Menutypetbl record);

    // 查看所有一级菜单和二级菜单
    List<Menutypetbl> findAllMenu();

    // 查看总数
    @Select("select count(*) from sys_room")
    @ResultType(int.class)
    int selectCount();
}