package com.example.board.controller;


import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.board.domain.Board;
import com.example.board.service.BoardService;

@Controller
@RequestMapping("/Board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	//TEST
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String test() {
		return "form";
	}
	

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerForm(Model model, HttpServletRequest request) throws Exception{
		//System.out.println("제목 : " + board.getTitle());
		//System.out.println("내용 : " + board.getText());
		//System.out.println("글쓴이 : " + board.getWriter());
		//System.out.println("_____________________HttpServletRequest________________");
		System.out.println("제목 : " + request.getParameter("title"));
		System.out.println("내용 : " + request.getParameter("text"));
		System.out.println("글쓴이 : " + request.getParameter("writer"));
		//service.register(board);
		Board bd = new Board();
		bd.setText(request.getParameter("text"));
		bd.setWriter(request.getParameter("writer"));
		bd.setTitle(request.getParameter("title"));
		service.register(bd);
		return "register_OK";
	}
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Board board, Model model) throws Exception{
		service.register(board);
		model.addAttribute("msg", "등록이 완료되었습니다.");
		return "form";
	}
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("boardNo") int boardNo, Model model) throws Exception{
		model.addAttribute(service.read(boardNo));
	}
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception{
		model.addAttribute(service.list());
		
	}
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("boardNo") int boardNo, Model model) throws Exception{
		service.remove(boardNo);
		model.addAttribute("msg","삭제가 완료되었습니다.");
		return "board/success";
	}
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(int boardNo, Model model) throws Exception{
		model.addAttribute(service.read(boardNo));
	}
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Board board, Model model) throws Exception{
		service.modify(board);
		model.addAttribute("msg", "수정이 완료되었습니다.");
		return "board/success";
	}
	@RequestMapping(value = "/listview", method = RequestMethod.GET)
	public String listview(Model model) throws Exception {
		List<Board> boardList = service.list();
		model.addAttribute(boardList);
		return "list";
	}
	
	@RequestMapping(value = "delete-select", method = RequestMethod.GET)
	public String removeBySelect(Model model) throws Exception {
		model.addAttribute(service.list());
		return "delete";
	}
	
	
	
	
	
}
