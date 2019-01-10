/**
 * FileName: ClickInfoController
 * Author:   wyr
 * Date:     2019/1/10 17:43
 * Description:
 */

package com.qfedu.controller;

import com.qfedu.service.ClickInfoService;
import com.qfedu.service.IndexListInfoService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "接口文档",value = "烘培，煲汤，本周佳作，素食主义的单条数据的接口文档")
@RestController
@CrossOrigin
public class ClickInfoController {

    @Autowired(required = true)
    private IndexListInfoService indexListInfoService;

    @Autowired(required = true)
    private ClickInfoService clickInfoService;

    @ApiOperation(notes = "实现传递参数，响应点击的数据信息",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "获取一条数据的信息的数据接口")
    @GetMapping("/singleInfo.do")
    public ResultVo singlelnfo(@ApiParam(value = "参数，该条数据的标题，属性为info")String info){
        return ResultVo.setOK(indexListInfoService.findSingleInfo(info));
    }

    @ApiOperation(notes = "实现传递参数，响应点赞量+1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "点赞量+1的数据接口")
    @GetMapping("/like.do")
    public ResultVo like(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.likeCountAuto(id));
    }

    @ApiOperation(notes = "实现传递参数，响应播放量+1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "播放量+1的数据接口")
    @GetMapping("/play.do")
    public ResultVo play(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.playCountAuto(id));
    }

    @ApiOperation(notes = "实现传递参数，响应收藏量+1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "收藏量+1的数据接口")
    @GetMapping("/collect.do")
    public ResultVo collect(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.collectCountAuto(id));
    }

    @ApiOperation(notes = "实现传递参数，响应收藏量-1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "收藏量-1的数据接口")
    @GetMapping("/collect2.do")
    public ResultVo collect2(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.collectCountReduce(id));
    }

    @ApiOperation(notes = "实现传递参数，响应点赞量-1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "点赞量-1的数据接口")
    @GetMapping("/like2.do")
    public ResultVo like2(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.likeCountReduce(id));
    }

    @ApiOperation(notes = "实现传递参数，响应播放量-1",tags = {"烘培，煲汤，本周佳作，素食主义页面的单条数据展示"},value = "播放量-1的数据接口")
    @GetMapping("/play2.do")
    public ResultVo play2(@ApiParam(value = "参数，该条数据的id，属性为id")Integer id){
        return ResultVo.setOK(clickInfoService.playCountRedecu(id));
    }

}
