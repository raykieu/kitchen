package com.qfedu.controller;

import com.qfedu.entity.Constitution;
import com.qfedu.service.ConstitutionService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是体质测试的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class ConstitutionController {


    @Autowired(required = true)
    private ConstitutionService conservice;

    /**
     *
     * @return 返回所有的体质测试信息
     */
    @ApiOperation("查询所有体质测试信息")
    @GetMapping("findAllConstitution.do")
    ResultVo findAllConstitution(){ return conservice.findAllCon(); }

    /**
     *
     * @param con 体质测试对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation("添加体质测试的信息")
    @GetMapping("addConstitution.do")
    ResultVo addConstitution(@ApiParam(value = "传入cResult") Constitution con){ return conservice.add(con); }

    /**
     *
     * @param con 体质测试对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation("修改体质测试的信息")
    @GetMapping("updateConstitution.do")
    ResultVo updataConstitution(@ApiParam(value = "传入cId,cInfo") Constitution con){ return conservice.update(con); }

    /**
     *
     * @param con 体质测试对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation("删除体质测试的信息")
    @GetMapping("deleteConstitution.do")
    ResultVo deleteConstitution(@ApiParam(value = "传入cId") Constitution con){ return conservice.delete(con); }
}
