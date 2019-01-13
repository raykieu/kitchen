/**
 * FileName: VipInfoTypeController
 * Author:   wyr
 * Date:     2019/1/13 15:24
 * Description:
 */

package com.qfedu.controller;

import com.qfedu.service.VipInfoTypeService;
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
public class VipInfoTypeController {

    @Autowired(required = true)
    private VipInfoTypeService vipInfoTypService;

    @ApiOperation(notes = "实现传递参数，响应名厨的类型数据",tags = {"名厨类型及数据展示"},value = "获取名厨全部类型的数据接口")
    @GetMapping("showAllType.do")
    public ResultVo showAllType(){
        return ResultVo.setOK(vipInfoTypService.findVipType().getData());
    }
}
