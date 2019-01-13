package com.qfedu.dao;

import com.qfedu.entity.VipInfoType;
import com.qfedu.vo.VipInfoShowVo;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VipInfoTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VipInfoType record);

    int insertSelective(VipInfoType record);

    VipInfoType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VipInfoType record);

    int updateByPrimaryKey(VipInfoType record);

    //通过id查询名厨分类信息
    @Select("SELECT * from t_vipinfotype")
    @ResultType(VipInfoType.class)
    List<VipInfoShowVo> selectAllType();

}