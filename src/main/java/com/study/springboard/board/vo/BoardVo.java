package com.study.springboard.board.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardVo {
    private Long orderNo;
    private String title;
    private String content;
    private String name;
    private String userId;

}
