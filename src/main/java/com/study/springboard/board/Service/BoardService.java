package com.study.springboard.board.Service;

import com.study.springboard.board.mapper.BoardMapper;
import com.study.springboard.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.springboard.util.MaskingUtil;
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
        List<BoardVo> list = boardMapper.selectBoardList();
        for (BoardVo vo : list) {
            String nm = MaskingUtil.maskingName(vo.getName());
            vo.setName(nm);
        }
        return list;// 게시글 리스트 반환
    }
}