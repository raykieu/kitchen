package com.qfedu.service;

import com.qfedu.entity.Menutypetbl;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;

public interface MenutypetblService {

    ResultVo findAllMenu(int mId);

    ResultVo addMenu(Menutypetbl me);

    ResultVo deleteMenu(Menutypetbl me);

    ResultVo updateMenu(Menutypetbl me);

    ResultVo findByMenuName(String mname);

    ResultVo findAllOneMenu();

    ResultVo findByMenuId(Integer mId);

    ResultVo findAllOneSport();

    ResultVo addSport(Menutypetbl me);

    ResultVo findByMenuSport(String mname);



}
