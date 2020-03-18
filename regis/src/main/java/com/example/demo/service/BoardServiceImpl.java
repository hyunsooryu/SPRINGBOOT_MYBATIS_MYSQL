package com.example.demo.service;

import com.example.demo.domain.Board;
import com.example.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    BoardMapper boardMapper;

    @Override
    public void register(Board board){
        boardMapper.create(board);
    }

    @Override
    public Board read(Integer userNo){
        return boardMapper.read(userNo);
    }
}
