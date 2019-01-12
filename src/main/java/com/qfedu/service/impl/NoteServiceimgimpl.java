package com.qfedu.service.impl;

import com.qfedu.dao.NoteMapper;
import com.qfedu.dao.NoteimagMapper;
import com.qfedu.dao.tuserMapper;
import com.qfedu.entity.Note;
import com.qfedu.entity.tuser;
import com.qfedu.service.NoteServiceimg;
import com.qfedu.vo.PageBeanVo;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NoteServiceimgimpl implements NoteServiceimg {
    @Autowired
    private NoteimagMapper noteimgDao;

    @Override
    public PageBeanVo findAllBiji(Integer page, Integer limit) {
        Map<String,Object> map = new HashMap<>();
        map.put("index",(page - 1) * limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(noteimgDao.selectCount(),noteimgDao.findAllNote(map));
    }

}
