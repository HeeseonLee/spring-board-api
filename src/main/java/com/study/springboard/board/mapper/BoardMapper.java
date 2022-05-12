package com.study.springboard.board.mapper;

import org.springframework.stereotype.Repository;
import com.study.springboard.board.vo.BoardVo;

import java.util.List;

@Repository
public interface BoardMapper {

    int selectBoardListCount();
    List<BoardVo> selectBoardList();
}
