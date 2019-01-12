package com.qfedu.service.impl;

import com.qfedu.dao.NoteMapper;
import com.qfedu.dao.tuserMapper;
import com.qfedu.entity.Note;
import com.qfedu.entity.tuser;
import com.qfedu.service.NoteService;
import com.qfedu.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceimpl implements NoteService {

    @Autowired
    private NoteMapper noteDao;

    @Autowired
    private tuserMapper userDao;

    @Override
    public ResultVo add(Note no) {
        Note note = noteDao.selectByPrimaryKey(no.getnId());
        if (note != null) {
            note.setnNice(no.getnNice() + 1);
            noteDao.updateByPrimaryKeySelective(note);
            return ResultVo.setOK(null);
        }
        return  ResultVo.setERROR();

    }
}
