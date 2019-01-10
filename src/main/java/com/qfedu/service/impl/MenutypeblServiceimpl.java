package com.qfedu.service.impl;

import com.qfedu.dao.MenutypetblMapper;
import com.qfedu.entity.Menutypetbl;
import com.qfedu.service.MenutypetblService;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MenutypeblServiceimpl implements MenutypetblService {

    @Autowired(required = true)
    private MenutypetblMapper menudao;

    @Override
    public ResultVo findAllMenu(int mid) {

        List<Menutypetbl> list = menudao.findAllMenu(mid);
        return ResultVo.setOK(list);
    }

    @Override
    public ResultVo addMenu(Menutypetbl me) {

        me.setmFlag(0);
        me.setmType(0);
        if(menudao.insertSelective(me) > 0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo deleteMenu(Menutypetbl me) {

        Menutypetbl me1 = menudao.findByMenuId(me.getmId());
        if(me1.getmId() != 0){
            me1.setmFlag(1);
            menudao.updateByPrimaryKeySelective(me1);
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo updateMenu(Menutypetbl me) {

        Menutypetbl me1 = menudao.findByMenuId(me.getmId());
        if(me1 != null) {
            me1.setmName(me.getmName());
            menudao.updateByPrimaryKeySelective(me1);
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByMenuName(String mname) {
        Menutypetbl me = menudao.findByMenuName(mname);
        if (me != null) {
            return ResultVo.setOK(me);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findAllOneMenu() {
        List<Menutypetbl> list = menudao.findAllOneMenu();
        if (list.size() != 0) {
            return ResultVo.setOK(list);
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo findByMenuId(Integer mId) {
        Menutypetbl me = menudao.findByMenuId(mId);
        if(me != null) {
            return ResultVo.setOK(null);
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo findAllOneSport() {
        List<Menutypetbl> list = menudao.findAllOneSport();
        if (list != null) {
            return ResultVo.setOK(list);
        }
        return  ResultVo.setERROR();
    }

    @Override
    public ResultVo addSport(Menutypetbl me) {
        me.setmFlag(0);
        me.setmType(1);
        if(menudao.insertSelective(me) > 0){
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    @Override
    public ResultVo findByMenuSport(String mname) {
        Menutypetbl me = menudao.findByMenuSport(mname);
        if (me != null) {
            return ResultVo.setOK(me);
        }
        return ResultVo.setERROR();
    }

}
