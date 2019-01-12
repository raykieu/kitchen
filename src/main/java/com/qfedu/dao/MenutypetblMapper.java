package com.qfedu.dao;

import com.qfedu.entity.Menutypetbl;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MenutypetblMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Menutypetbl record);

    int insertSelective(Menutypetbl record);

    Menutypetbl selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Menutypetbl record);

    int updateByPrimaryKey(Menutypetbl record);

    // 查看所有二级菜单
    List<Menutypetbl> findAllMenu(Integer mId);

    // 查看总数
    @Select("select count(*) from menutypetbl")
    @ResultType(int.class)
    int selectCount();

    // 根据ID查询菜单对象
    Menutypetbl findByMenuId(int mid);

    // 根据菜品名字查找
    List<Menutypetbl> findByMenuName(String mName);

    // 查询所有一级菜谱分类
    List<Menutypetbl> findAllOneMenu();

    // 查询所有一级美食养生分类
    List<Menutypetbl> findAllOneSport();

    // 根据菜品名字查找
    List<Menutypetbl> findByMenuSport(String mName);
}