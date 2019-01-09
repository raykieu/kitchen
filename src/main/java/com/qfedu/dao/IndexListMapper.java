package com.qfedu.dao;

import com.qfedu.entity.IndexList;
import org.apache.ibatis.annotations.ResultType;
import com.qfedu.vo.TwoMenuInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IndexListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndexList record);

    int insertSelective(IndexList record);

    IndexList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndexList record);

    int updateByPrimaryKey(IndexList record);

    //通过id(烘培,煲汤,素食主义,本周佳作)展示菜单信息
    @Select( " select `name`,p2.info,img_url,video_url,cook_name,like_count,play_count,collect_count FROM t_typetwo p1 INNER JOIN t_indexlist p2 on  p1.id=p2.tpid INNER JOIN t_clickinfo p3 on  p2.clid=p3.id WHERE p1.id=#{id}")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectByAllType(Integer id);

    //通过输入标题查询相似信息展示 本周佳作
    @Select("select `name`,p2.info,img_url,video_url,cook_name,like_count,play_count,collect_count FROM t_typetwo p1 INNER JOIN t_indexlist p2 on  p1.id=p2.tpid INNER JOIN t_clickinfo p3 on  p2.clid=p3.id WHERE p1.id=1 and p2.info like CONCAT('%' ,#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectByType1(String title);


    //通过输入标题查询相似信息展示 烘培
    @Select("select `name`,p2.info,img_url,video_url,cook_name,like_count,play_count,collect_count FROM t_typetwo p1 INNER JOIN t_indexlist p2 on  p1.id=p2.tpid INNER JOIN t_clickinfo p3 on  p2.clid=p3.id WHERE p1.id=2 and p2.info like CONCAT('%' ,#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectByType2(String title);

    //通过输入标题查询相似信息展示 煲汤
    @Select("select `name`,p2.info,img_url,video_url,cook_name,like_count,play_count,collect_count FROM t_typetwo p1 INNER JOIN t_indexlist p2 on  p1.id=p2.tpid INNER JOIN t_clickinfo p3 on  p2.clid=p3.id WHERE p1.id=3 and p2.info like CONCAT('%' ,#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectByType3(String title);

    //通过输入标题查询相似信息展示 素食主义
    @Select("select `name`,p2.info,img_url,video_url,cook_name,like_count,play_count,collect_count FROM t_typetwo p1 INNER JOIN t_indexlist p2 on  p1.id=p2.tpid INNER JOIN t_clickinfo p3 on  p2.clid=p3.id WHERE p1.id=4 and p2.info like CONCAT('%' ,#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectByType4(String title);

}