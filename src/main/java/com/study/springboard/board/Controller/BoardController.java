package com.study.springboard.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/board")
public class BoardController {

    @GetMapping("/list")
    public String list() { // 테스트
        return "/board/testSetting";

    }

}
