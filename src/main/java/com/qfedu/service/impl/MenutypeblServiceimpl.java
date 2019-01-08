package com.qfedu.service.impl;

import com.qfedu.dao.MenutypetblMapper;
import com.qfedu.entity.Menutypetbl;
import com.qfedu.service.MenutypetblService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenutypeblServiceimpl implements MenutypetblService {

    @Autowired
    private MenutypetblMapper menudao;

    @Override
    public ResultVo findAllMenu(int mFlag, int mType, Integer page, Integer limit) {


        List<Menutypetbl> list = menudao.findAllMenu();

        return ResultVo.setERROR();
    }
}
