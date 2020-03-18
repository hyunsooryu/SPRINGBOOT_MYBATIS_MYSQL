package com.example.demo.controller;

import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public String read(){

        return boardService.read(1).toString();
    }

    /*
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestBody){}
    */
}
