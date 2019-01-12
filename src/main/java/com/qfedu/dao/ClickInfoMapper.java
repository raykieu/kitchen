package com.qfedu.dao;

import com.qfedu.entity.ClickInfo;
import com.qfedu.vo.TwoMenuInfo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


public interface ClickInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClickInfo record);

    int insertSelective(ClickInfo record);

    ClickInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClickInfo record);

    int updateByPrimaryKey(ClickInfo record);

    //通过id，获取本条数据
    @Select("select s1.id as sid ,s1.info,s1.img_url,s1.video_url,s1.cook_name,s1.clid,s2.like_count,s2.collect_count,s2.play_count,s2.look_count from t_indexlist s1 INNER JOIN t_clickinfo s2 on s1.clid = s2.id where s1.id = 1")
    @ResultType(TwoMenuInfo.class)
    TwoMenuInfo selectByInfoId(Integer id);

    //通过id点赞加一
    @Update(" update t_clickinfo set like_count = like_count+1 where id = #{id}")
    int updateLikeCountById(Integer id);

    //通过id收藏加一
    @Update(" update t_clickinfo set collect_count=collect_count+1 where id = #{id}")
    int updateCollectCountById(Integer id);

    //通过id播放量加一
    @Update("update t_clickinfo set play_count=play_count+1 where id = #{id}")
    int updatePlayCountById(Integer id);

    //通过id浏览量加一
    @Update("update t_clickinfo set look_count=look_count+1 where id = #{id}")
    int updateLookCountById(Integer id);

    //通过id点赞减一
    @Update("update t_clickinfo set like_count=like_count-1 where tlike_count>0 and id =#{id}")
    int updateLikeCountById2(Integer id);

    //通过id收藏减一
    @Update("update t_clickinfo set collect_count=collect_count-1 where collect_count>0 and id =#{id}")
    int updateCollectCountById2(Integer id);

    //通过id播放量减一
    @Update("update t_clickinfo set play_count=play_count-1 where play_count>0 and id = #{id}")
    int updatePlayCountById2(Integer id);



}