package com.qfedu.controller;

import com.qfedu.entity.Foodmenu;
import com.qfedu.service.FoodMenuService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是健身七分吃里面的菜谱的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class FoodMenuController {

    @Autowired
    private FoodMenuService foodService;

    @ApiOperation("响应所有菜谱的分页")
    @GetMapping("findAllFoodMenu.do")
    PageBeanVo findAllFoodMenu(@ApiParam("传入分页page,limit") Integer page, Integer limit){ return foodService.findAllMenu(page, limit); }

    @ApiOperation("添加菜谱")
    @GetMapping("addFoodMenu.do")
    ResultVo addFoodMenu(@ApiParam("传入用户uId，编辑文本mText") Foodmenu fm){
        return  foodService.addMenu(fm);
    }
}
