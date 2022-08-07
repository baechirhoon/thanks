package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardContoller {

    //@GetMapping("/")
    //@GetMapping("/board/write")
    //@ResponseBody
    @RequestMapping("/board/write")
    //@GetMapping("/write")
    public String boardWriteForm() {

        return "boardwrite.html";
    }
}