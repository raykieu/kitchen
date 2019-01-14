package com.qfedu.controller;

import com.qfedu.entity.Menutypetbl;
import com.qfedu.service.MenutypetblService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(produces = "这是菜单分类和美食养生的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class MenutyeblController {

    @Autowired(required = true)
    private MenutypetblService menuService;

    /**
     * @param mId 菜单分类ID
     * @return 所有二级菜单。
     */
    @ApiOperation(notes = "响应菜谱ID对应的所有菜品的数据",tags = {"根据mId查询菜品"},value = "传入mId")
    @GetMapping("findTwoMenu.do")
    ResultVo findTwoMenu(Integer mId){  return menuService.findAllMenu(mId); }

    /**
     *
     * @param mId 菜单分类对象Id。
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "响应菜谱ID对应的菜谱或菜品的单个数据",tags = {"根据mId查询菜品"},value = "传入mId")
    @GetMapping("findMenuById.do")
    ResultVo findByMenuId(Integer mId){
        return menuService.findByMenuId(mId);}

    /**
     *
     * @param me 菜单分类对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "响应菜谱或菜品的删除操作",tags = {"删除菜单或菜品"},value = "传入mId")
    @GetMapping("deleteById.do")
    ResultVo deleteMenu(Menutypetbl me){
        return menuService.deleteMenu(me);
    }

    /**
     *
     * @param me 菜单分类对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "响应对指定菜品名字的修改操作",tags = {"修改指定菜单的名字"},value = "传入mId")
    @GetMapping("updateMenu.do")
    ResultVo updateMenu(Menutypetbl me){
        return menuService.updateMenu(me);
    }

    /**
     *
     * @param mName 根据菜品名称查找对象
     * @return 菜品对象
     */
    @ApiOperation(notes = "实现传递参数，响应菜单的模糊查询数据",tags = {"传入菜单二级分类的名字"},value = "输入菜单二级分类的名字mName")
    @GetMapping("findByMenuName.do")
    ResultVo findByMenuName(String mName){
        return menuService.findByMenuName(mName);
    }

    /**
     * @return 所有一级菜单
     */
    @ApiOperation("响应指定数量的数据")
    @GetMapping("findAllOneMenu.do")
    ResultVo findAllMenu(){ return menuService.findAllOneMenu(); }

    /**
     *
     * @param me 菜单对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "实现传递参数，响应菜单添加",tags = {"添加菜谱"},value = "传入mParent=0,mParent=对应的菜谱ID")
    @GetMapping("addMenu.do")
    ResultVo addMenu(Menutypetbl me){ return menuService.addMenu(me); }

    /**
     *
     * @return 所有的美食养生一级分类。
     */
    @ApiOperation("响应查询所有美食养生数据")
    @GetMapping("findAllOneSport.do")
    ResultVo findAllOneSport(){ return menuService.findAllOneSport(); }

    /**
     *
     * @param mId 菜单分类对象
     * @return 美食养生对应的二级分类
     */
    @ApiOperation(notes = "响应美食养生ID对应的所有的二级分类的数据",tags = {"查询美食养生对应的二级分类"},value = "传入mId")
    @GetMapping("findTwoSport.do")
    ResultVo findTwoSport(Integer mId){ return menuService.findAllMenu(mId); }

    /**
     *
     * @param me 菜单对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "添加美食养生（mParent=0）添加美食养生的二级分类",tags = {"添加美食养生的二级分类"},value = "传入的参数mName,mParent")
    @GetMapping("addSport.do")
    ResultVo addSport(Menutypetbl me){ return menuService.addSport(me); }

    /**
     *
     * @param me 美食养生分类对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "响应美食养生的删除操作",tags = {"删除美食养生"},value = "传入mId")
    @GetMapping("deleteSport.do")
    ResultVo deleteSport(Menutypetbl me){
        return menuService.deleteMenu(me);
    }

    /**
     *
     * @param me 美食养生分类对象
     * @return code成功 ->0  msg异常信息 成功 —>OK。
     */
    @ApiOperation(notes = "响应对指定美食养生名字的修改操作",tags = {"修改美食养生"},value = "传入mId")
    @GetMapping("updateSport.do")
    ResultVo updateSport(Menutypetbl me){
        return menuService.updateMenu(me);
    }

    /**
     *
     * @param mName 根据美食养生名称查找对象
     * @return 美食养生对象
     */
    @ApiOperation(notes = "响应模糊查询美食养生的二级分类",tags = {"模糊查询"},value = "传入mName")
    @GetMapping("findBySportName.do")
    ResultVo findBySportName(String mName){
        return menuService.findByMenuSport(mName);
    }
}
