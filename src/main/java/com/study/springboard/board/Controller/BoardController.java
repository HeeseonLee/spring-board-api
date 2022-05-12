package com.study.springboard.board.Controller;

import com.study.springboard.board.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService service; //추가2
    @GetMapping("/list")
    public String list(Model model) { // 테스트

        model.addAttribute("count", service.selectBoardListCount());
        model.addAttribute("list", service.selectBoardList());

        return "/board/testSetting";

    }

}
