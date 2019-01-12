package com.qfedu.controller;

import com.qfedu.config.QcloudSms;
import com.qfedu.consts.SystemConst;
import com.qfedu.entity.Tcode;
import com.qfedu.entity.tuser;
import com.qfedu.service.UserService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户注册")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService Userdao;
    @ApiOperation(notes = "实现用户登陆",tags = "登录接口",value = "输入账号密码实现用户登录")
    @GetMapping("UserLogin.do")
    public ResultVo Login(String username,String password){
        tuser user=new tuser();
        user.setUsername(username);
        user.setPassword(password);
        ResultVo resultVo = Userdao.selectByName(username, password);
        if (resultVo.getData()!=null){
            SystemConst.currUsers.put(username,user);
            return ResultVo.setOK(username);
        }else{
            return  ResultVo.setERROR();
        }


    }
    @ApiOperation(notes = "实现用户注销",tags = "注销接口",value = "从前端传入用户名")
    //注销
    @GetMapping("/userloginout.do")
    public ResultVo login(String token){
        SystemConst.currUsers.remove(token);
        return ResultVo.setOK(null);
    }
    @ApiOperation(notes = "向用户发送短信验证",tags = {"点击发送验证码"},value = "输入手机号")
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

    @ApiOperation(notes = "判断验证码是否正确",tags = "用户输入框的值",value = "输入手机上收到的验证码")
    //验证码是否正确
    @GetMapping("verifycode.do")
    public ResultVo verifycode(String username,String password,String phonenumber,String code){

      ResultVo  resultVo= Userdao.selectByphonecode(phonenumber,code);
      if (resultVo.getCode()==0){
          tuser auser=new tuser();
          auser.setUsername(username);
          auser.setPassword(password);
         auser.setPhonenumber(phonenumber);

          return Userdao.addUser(auser);
      }else{
          return ResultVo.setERROR();
      }

    }



}
