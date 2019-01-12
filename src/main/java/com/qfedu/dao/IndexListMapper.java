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

    //通过id展示 烘培/煲汤/素食主义/本周佳作 全部信息
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p1.id=#{id}")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoAllByTypeId(Integer id);

    //通过title模糊查询 本周佳作 数据
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p1.id=1 and p2.info like CONCAT('%',#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoByTitle(String title);

    //通过title模糊查询 烘培 数据
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p1.id=2 and p2.info like CONCAT('%',#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoByTitle2(String title);

    //通过title模糊查询 煲汤 数据
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p1.id=3 and p2.info like CONCAT('%',#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoByTitle3(String title);

    //通过title模糊查询 素食主义 数据
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p1.id=4 and p2.info like CONCAT('%',#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoByTitle4(String title);

    //通过title模糊查询，全部关键字数据
    @Select("select p1.id,p1.`name`,p2.id as sid ,p2.info,p2.img_url,p2.video_url,p2.cook_name,p2.clid,p3.like_count,p3.collect_count,p3.play_count,p3.look_count from t_typetwo p1 INNER JOIN t_indexlist p2 ON p2.tpid=p1.id INNER JOIN t_clickinfo p3 ON p2.clid=p3.id where p2.info like CONCAT('%',#{title},'%')")
    @ResultType(TwoMenuInfo.class)
    List<TwoMenuInfo> selectInfoAllByTitle(String title);


}