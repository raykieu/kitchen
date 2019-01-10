package com.qfedu.service.impl;

import com.qfedu.dao.TcodeMapper;
import com.qfedu.dao.tuserMapper;
import com.qfedu.entity.Tcode;
import com.qfedu.entity.tuser;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private tuserMapper tuserdao;

    @Autowired
    private TcodeMapper codedao;

    @Override
    public ResultVo selectByName(String name, String password) {
         tuser user=tuserdao.selectByName(name);
         if (user!=null&&password.equals(user.getPassword())){

             return ResultVo.setOK(user);
         }else {
             return ResultVo.setERROR();
         }


}

    @Override
    public ResultVo addUser(tuser user) {

         int insert = tuserdao.insert(user);
        if (insert>0){
           return ResultVo.setOK(null);
       }else{
           return ResultVo.setERROR();
       }


    }
    //发送验证码
    @Override
    public ResultVo addcode(Tcode code) {
        int insert = codedao.insert(code);
        if (insert>0){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo selectByphone(String phone) {
        Tcode tcode = codedao.selectByphone(phone);
        if (tcode==null){
            return  ResultVo.setOK("验证码已发送请注意查收");
        }else {
                return  ResultVo.setERROR();
        }

    }

    @Override
    public ResultVo selectByphonecode(String phone,String code) {
        Tcode tcode = codedao.selectByphone(phone);
        if (code.equals(tcode.getCode())){
            return ResultVo.setOK(tcode);
        }else{
            return ResultVo.setERROR();
        }


    }

}
