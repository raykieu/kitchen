package com.qfedu.service;

import com.qfedu.entity.Tcode;
import com.qfedu.entity.tuser;
import com.qfedu.vo.ResultVo;

public interface UserService {
    ResultVo selectByName(String name,String password);

    ResultVo addUser(tuser user);
    ResultVo addcode(Tcode code);
    //验证手机是否发送验证码
    ResultVo selectByphone(String phone);
    //验证手机输入验证码是否正确
    ResultVo selectByphonecode(String phone,String code);



}
