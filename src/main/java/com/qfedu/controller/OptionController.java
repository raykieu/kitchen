package com.qfedu.controller;


import com.qfedu.service.OptionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这个几口文档没用 先不删",value = "接口文档")
@RestController
@CrossOrigin
public class OptionController {

    @Autowired(required = true)
    private OptionService opService;

    /**
     *
     * @return 返回所有的体质测试信息
     */
    @ApiOperation("这个街口多写 没有用")
    @GetMapping("findAllOption.do")
    ResultVo findAllOption(){ return opService.findAllOption(); }

}
