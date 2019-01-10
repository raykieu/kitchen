/**
 * FileName: ListMenuTwoConller
 * Author:   wyr
 * Date:     2019/1/9 11:42
 * Description:
 */

package com.qfedu.controller;

import com.qfedu.service.IndexListTwoService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "接口文档",value = "烘培，煲汤，本周佳作，素食主义的接口文档")
@RestController
@CrossOrigin
public class ListMenuTwoConller {
    @Autowired(required = true)
    private IndexListTwoService indexListTwoServiceImpl;

    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"烘培，煲汤，本周佳作，素食主义数据展示"},value = "获取展示数据接口")
    @GetMapping("/listMenuTwo.do")
    public ResultVo SecondMenu(@ApiParam(value = "参数：种类信息，本周佳作1，烘培2，煲汤3，素食主义4") Integer id){
        return  ResultVo.setOK(indexListTwoServiceImpl.findMenuInfoTwo(id).getData());
    }

    //佳作
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"本周佳作"},value = "获取展示数据接口")
    @GetMapping("/meritMenu.do")
    public ResultVo MeritMenu(@ApiParam(value = "标题，关键字") String title){
        return ResultVo.setOK(indexListTwoServiceImpl.findMerit(title).getData());
    }

    //烘焙
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"烘培"},value = "获取展示数据接口")
    @GetMapping("/bakeMenu.do")
    public ResultVo BakeMenu(@ApiParam(value = "标题，关键字")String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findBake(title).getData());
    }

    //煲汤
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"煲汤"},value = "获取展示数据接口")
    @GetMapping("/cookSoupMenu.do")
    public ResultVo CookSoupMenu(@ApiParam(value = "数据的info")String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findCookSoup(title).getData());
    }

    //素食主义
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"素食主义"},value = "获取展示数据接口")
    @GetMapping("/vegetarianismMenu.do")
    public ResultVo VegetarianismMenu(@ApiParam(value = "参数为条数据的标题/关键字")String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findVegetarianism(title).getData());
    }

    //首页顶部搜索框
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"首页顶部搜索框"},value = "输入标题查询相应的煲汤，素食主义，佳作，烘培全部数据的数据接口")
    @GetMapping("/searchMenuInfo.do")
    public ResultVo SearchMenuInfo(@ApiParam(value = "参数,搜索框数入的标题/关键字")String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findMenuInfoByTitle(title).getData());
    }

}
