package com.qfedu.controller;


import com.qfedu.entity.Attendance;
import com.qfedu.entity.Note;
import com.qfedu.service.NoteServiceimg;
import com.qfedu.vo.PageBeanVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(produces = "这是签到红包的接口文档",value = "接口文档")
@RestController
@CrossOrigin
public class NoteImgController {

    @Autowired
    private NoteServiceimg noteService;

    @ApiOperation("响应所有笔记内容")
    @GetMapping("findAllBiji.do")
    PageBeanVo findAllNote(Integer page, Integer limit){
       return noteService.findAllBiji(page,limit);
    }

}
