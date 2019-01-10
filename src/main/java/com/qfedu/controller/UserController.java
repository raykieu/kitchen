package com.qfedu.controller;

import com.qfedu.config.QcloudSms;
import com.qfedu.entity.Tcode;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService Userdao;

    @GetMapping("UserLogin")
    public ResultVo Login(String username,String password){
        ResultVo resultVo = Userdao.selectByName(username, password);

        return  resultVo;
    }
    //发送验证码
    @PostMapping("Getphonecode.do")
    public  ResultVo phonecode(String phone){
        String code =  QcloudSms.getCode();//获取随机验证码
        ResultVo addcode = null;
        Tcode tcode=new Tcode();
        tcode.setPhonenumber(phone);
        tcode.setCode(code);

        try {
            //调用接口方法，发送短信到手机 --phone接收短信的手机号码
            ResultVo resultVo = Userdao.selectByphone(phone);
            if (resultVo.getCode()==1){
                return  ResultVo.setOK("验证码已经发送请耐心等待");
            }else{
                addcode = Userdao.addcode(tcode);
                QcloudSms.sendCode(phone,code);
                return resultVo ;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    return null;
    }
    //测试接口发送验证码/*@PostMapping("addcode.do")
    //    public  ResultVo addcode(String phone,String code){
    //        Tcode tcode=new Tcode();
    //        tcode.setCode(code);
    //        tcode.setPhonenumber(phone);
    //      return   Userdao.addcode(tcode);
    //
    //    }*/

    //验证码是否正确
    @GetMapping("verifycode.do")
    public ResultVo verifycode(String phonenumber,String code){

        return  Userdao.selectByphonecode(phonenumber,code);
    }



}
