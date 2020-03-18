package com.example.demo.mapper;

import com.example.demo.domain.Board;

import java.util.List;

public interface BoardMapper {
    public void create(Board board);

    public Board read(Integer userNo);

    /*
    public void update(Board board) throws Exception;

    public void delete(Integer boardNo) throws Exception;

    public List<Board> list() throws Exception;

     */
}
