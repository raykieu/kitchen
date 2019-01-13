/**
 * FileName: VipInfoShowController
 * Author:   wyr
 * Date:     2019/1/13 15:51
 * Description:
 */

package com.qfedu.controller;

import com.qfedu.service.VipInfoShowService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces = "接口文档",value = "名厨模块的接口文档")
@RestController
@CrossOrigin
public class VipInfoShowController {

    @Autowired(required = true)
    private VipInfoShowService vipInfoShowService;

    @ApiOperation(notes = "实现传递参数，通过类型id展示该类型数据",tags = {"名厨子类类型的数据展示"},value = "获取名厨的下级菜单的数据接口")
    @GetMapping("showInfo.do")
    public ResultVo showInfo(Integer id){
        return ResultVo.setOK(vipInfoShowService.findVipInfoById(id).getData());
    }

    @ApiOperation(notes = "实现传递参数，通过搜索展示该类型数据",tags = {"名厨子类类型的数据展示"},value = "搜索框获取信息的数据接口")
    @GetMapping("searchInfo.do")
    public ResultVo searchInfo(String title){
        return ResultVo.setOK(vipInfoShowService.findVipTypeByTitle(title).getData());
    }

}
