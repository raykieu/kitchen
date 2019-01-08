package com.qfedu.service;

import com.qfedu.vo.ResultVo;

public interface MenutypetblService {

    ResultVo findAllMenu(int mFlag, int mType, Integer page, Integer limit);
}
