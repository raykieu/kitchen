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

    //通过输入标题,信息展示
    @Select("select tp1.id,tp1.info,img_url,video_url ,cook_name,clid,like_count,collect_count,play_count from t_indexlist tp1 INNER JOIN t_clickinfo tp2 on tp1.clid = tp2.id where tp1.info = #{title}")
    @ResultType(TwoMenuInfo.class)
    TwoMenuInfo selectByInfo(String title);

    //通过输入(对应的点赞收藏表的id),信息展示
    @Select("select tp1.id,tp1.info,img_url,video_url ,cook_name,clid,like_count,collect_count,play_count from t_indexlist tp1 INNER JOIN t_clickinfo tp2 on tp1.clid = tp2.id where tp1.id = #{id}")
    @ResultType(TwoMenuInfo.class)
    TwoMenuInfo selectById(Integer id);

    //通过id点赞加一
    @Update(" update t_clickinfo set like_count = like_count+1 where id = #{id}")
    int updateLikeCountById(Integer id);

    //通过id收藏加一
    @Update(" update t_clickinfo set collect_count=collect_count+1 where id = #{id}")
    int updateCollectCountById(Integer id);

    //通过id播放量加一
    @Update("update t_clickinfo set play_count=play_count+1 where id = #{id}")
    int updatePlayCountById(Integer id);


}