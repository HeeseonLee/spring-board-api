package com.study.springboard.board.Controller;

import com.study.springboard.board.Service.BoardService;
import com.study.springboard.board.dto.ErrorDto;
import com.study.springboard.board.vo.BoardVo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;

    //게시글 목록
    @GetMapping(value = "/list1")
    public Map<String, String> list() throws Exception{

        Map<String, String> rtnMap = new HashMap<>();
        List<BoardVo> list = service.selectBoardList();
        rtnMap.put("list", String.valueOf(list));

        return rtnMap;
    }



    @GetMapping(value = "/list")
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> getlist(Exception ex) throws Exception{

        List<BoardVo> list = service.selectBoardList();
        ErrorDto dto = new ErrorDto();

        HttpHeaders header = new HttpHeaders();
        header.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        dto.setStatus(ErrorDto.StatusEnum.OK);
        dto.setData(list);
        //dto.setMessage(ex.getMessage());

        return new ResponseEntity<ErrorDto>(dto, header, HttpStatus.OK);

    }



}
