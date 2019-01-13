package com.qfedu.dao;

import com.qfedu.entity.VipInfoShow;
import com.qfedu.vo.VipInfoShowVo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VipInfoShowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VipInfoShow record);

    int insertSelective(VipInfoShow record);

    VipInfoShow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VipInfoShow record);

    int updateByPrimaryKey(VipInfoShow record);

    //通过id查询名厨分类信息
    @Select("SELECT v1.typename,v1.typeinfo,v2.id,v2.imgurl,v2.videourl,v2.uid,v2.title,v2.titleinfo,v3.uid,v3.username from t_vipinfotype v1 INNER JOIN t_vipinfoshow v2 ON v2.typeid=v1.id INNER JOIN t_user v3 ON v2.uid=v3.uid where v1.id=#{id}")
    @ResultType(VipInfoShowVo.class)
    List<VipInfoShowVo> selectAllInfoByTypeId(Integer id);

    //模糊查询 通过title
    @Select("SELECT v1.typename,v1.typeinfo,v2.id,v2.imgurl,v2.videourl,v2.uid,v2.title,v2.titleinfo,v3.uid,v3.username from t_vipinfotype v1 INNER JOIN t_vipinfoshow v2 ON v2.typeid=v1.id INNER JOIN t_user v3 ON v2.uid=v3.uid where v2.title like CONCAT('%',#{title},'%')")
    @ResultType(VipInfoShowVo.class)
    List<VipInfoShowVo> selectInfoByTitle(String title);




}