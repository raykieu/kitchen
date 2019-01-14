package com.qfedu.controller;

import com.qfedu.entity.Note;
import com.qfedu.service.NoteService;
import com.qfedu.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是笔记点赞的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class NoteController {

    @Autowired
    private NoteService noService;

    @ApiOperation(notes = "点赞的添加操作",tags = {"点赞详情"},value = "传入qUid,原来的点赞数nNice")
    @GetMapping("addNote.do")
    ResultVo addNice(Note no) { return noService.add(no); }
}
