package com.example.board.mapper;

import java.util.List;

import com.example.board.domain.Board;

public interface BoardMapper {
	//CRUD
	
	//C
	public void create(Board board) throws Exception;
	//R
	public Board read(Integer boardNo) throws Exception;
	//U
	public void update(Board board) throws Exception;
	//D
	public void delete(Integer boardNo) throws Exception;
	
	
	//LIST
	public List<Board> list() throws Exception;
	
}
