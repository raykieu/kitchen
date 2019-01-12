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

    @ApiOperation(notes = "实现传递参数，响应对应类型的数据",tags = {"数据类型展示。参数：id：本周佳作1，烘培2，煲汤3，素食主义4"},value = "获取展示数据接口")
    @GetMapping("/MenuInfoShow.do")
    public ResultVo MenuInfoShow(Integer id){
        return ResultVo.setOK(indexListTwoServiceImpl.findAllMenuInfo(id).getData());
    }

    //佳作
    @ApiOperation(notes = "实现传递参数，响应本周佳作模糊查询的数据",tags = {"本周佳作模糊查询。参数：输入框数据String"},value = "获取本周佳作搜索框结果的数据接口")
    @GetMapping("/meritMenu.do")
    public ResultVo MeritMenu(String title){
        return ResultVo.setOK(indexListTwoServiceImpl.findMerit(title).getData());
    }

    //烘焙
    @ApiOperation(notes = "实现传递参数，响应烘焙模糊查询的数据",tags = {"烘焙模糊查询,参数：输入框数据String"},value = "获取烘焙搜索框结果的数据接口")
    @GetMapping("/bakeMenu.do")
    public ResultVo BakeMenu(String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findBake(title).getData());
    }

    //煲汤
    @ApiOperation(notes = "实现传递参数，响应煲汤模糊查询的数据",tags = {"煲汤模糊查询,参数：输入框数据String"},value = "获取煲汤搜索框结果的数据接口")
    @GetMapping("/cookSoupMenu.do")
    public ResultVo CookSoupMenu(String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findCookSoup(title).getData());
    }
    //素食主义
    @ApiOperation(notes = "实现传递参数，响应素食主义模糊查询的数据",tags = {"素食主义模糊查询,参数：输入框数据String"},value = "获取素食主义搜索框结果的数据接口")
    @GetMapping("/vegetarianismMenu.do")
    public ResultVo VegetarianismMenu(String title) {
        return  ResultVo.setOK(indexListTwoServiceImpl.findVegetarianism(title).getData());
    }

  //首页顶部搜索框
  @ApiOperation(notes = "实现传递参数，响应模糊查询的数据",tags = {"顶部搜索框模糊查询,参数：输入框数据String"},value = "获取搜索框结果的数据接口")
  @GetMapping("/searchAll.do")
  public ResultVo SearchAll(String title) {
      return  ResultVo.setOK(indexListTwoServiceImpl.SearchMenuInfo(title).getData());
  }
}
