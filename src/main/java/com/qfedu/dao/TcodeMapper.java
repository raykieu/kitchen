package com.qfedu.dao;

import com.qfedu.entity.Tcode;
import org.apache.ibatis.annotations.Select;

public interface TcodeMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Tcode record);

    int insertSelective(Tcode record);

    Tcode selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Tcode record);

    int updateByPrimaryKey(Tcode record);
    @Select("SELECT * from t_code tc WHERE tc.phonenumber=#{phonenumber}")
    Tcode selectByphone(String phonenumber);
}