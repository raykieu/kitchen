package com.qfedu.service.impl;


import com.qfedu.dao.SportimgMapper;
import com.qfedu.entity.Sportimg;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportimgServiceimpl {

    @Autowired(required = true)
    private SportimgMapper sportimgDao;
    
    ResultVo add(Sportimg spo){

       if (sportimgDao.insert(spo) > 0){
           return ResultVo.setOK(null);
       }
       return  ResultVo.setERROR();
    }

}
