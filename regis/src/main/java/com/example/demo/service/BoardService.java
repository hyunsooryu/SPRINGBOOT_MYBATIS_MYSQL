package com.example.demo.service;

import com.example.demo.domain.Board;


public interface BoardService {
    public void register(Board board);
    public Board read(Integer userNo);

    /*
    public void modify(Board board) throws Exception;
    public void remove(Integer userNo) throws Exception;
    public List<Board> list() throws Exception;
     */
}
