package com.qfedu.controller;

import com.qfedu.entity.Sport;
import com.qfedu.service.SportService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Api(produces = "这是健身七分吃的接口文档",value = "接口文档")
@Controller
@CrossOrigin
public class SportController {


    @Autowired(required = true)
    private SportService sportSerivce;

    @ApiOperation(notes = "响应运动方式的四条数据数据",tags = {"查询四条运动方式"},value = "这个不用传参")
    @RequestMapping("find4Sports.do")
    @ResponseBody
    PageBeanVo find4Sports(Integer page, Integer limit){
      return sportSerivce.findAllSport(1,4);
    }

    @ApiOperation(notes = "响应运动方式数据数据",tags = {"查询所有运动方式"},value = "传入页码page,个数limit")
    @GetMapping("findAllSports.do")
    PageBeanVo findAllSports(Integer page, Integer limit){
        return sportSerivce.findAllSport(page,limit);
    }

    @ApiOperation(notes = "运动方式的文件上传，图片，图片信息",tags = {"上传运动方式图片"},value = "传入图片，传入图片信息sInfo")
    @RequestMapping("upload.do")
    @ResponseBody
    ResultVo upLoad(@RequestParam MultipartFile upfile,String sInfo){
        System.out.println(sInfo);
        String fileName = upfile.getOriginalFilename();
        // 全球唯一id
        String uuid = UUID.randomUUID().toString();
        fileName = uuid + "_" + fileName;
        System.out.println(fileName);
        String path = "D:/upload";
        File pathFile = new File(path);
        // 如果目录不存在，创建
        if(!pathFile.exists()){
            pathFile.mkdir();
        }
        File file = new File(path, fileName);
        try {
            // 保存
            upfile.transferTo(file);

        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Sport sp = new Sport();
        sp.setsInfo(sInfo);
        sp.setGoushi(fileName);
        sportSerivce.add(sp);
        return ResultVo.setOK(1);
    }

    @ApiOperation(notes = "运动方式表删除操作",tags = {"传入运动表sId"},value = "传入运动表sId")
    @RequestMapping("deleteSport1.do")
    @ResponseBody
    ResultVo deleteSport(Integer sId){
      return sportSerivce.delete(sId);
    }

    @ApiOperation("根据sId查询所有对应的信息")
    @RequestMapping("findSportById.do")
    @ResponseBody
    ResultVo findSportById(Integer sId) {
        Sport sp = sportSerivce.findSportById(sId);
        return ResultVo.setOK(sp);
    }

}
