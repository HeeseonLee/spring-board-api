package com.study.springboard.board.Service;

import com.study.springboard.board.mapper.BoardMapper;
import com.study.springboard.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;

    public int selectBoardListCount() {
        return boardMapper.selectBoardListCount(); // 게시글 수 반환
    }

    public List<BoardVo> selectBoardList() {
        return boardMapper.selectBoardList(); // 게시글 리스트 반환
    }
}