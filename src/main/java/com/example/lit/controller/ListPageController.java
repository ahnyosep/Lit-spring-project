package com.example.lit.controller;

import com.example.lit.domain.vo.review.ReviewVO;
import com.example.lit.service.project.LitService;
import com.example.lit.service.review.LitUpService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@Slf4j
@RequestMapping("/list/*")
public class ListPageController {
    private final LitService litService;
    private final LitUpService litUpService;

    //인기 목록 페이지
    @GetMapping("/popular")
    public List<ReviewVO> goPopularPage(){
        return null;
    }

    //신규 목록 페이지
    @GetMapping("/new")
    public List<ReviewVO> goNewPage(){
        return null;
    }

    //카테고리 페이지
    @GetMapping("/cate/{cateName}")
    public List<ReviewVO> goCatePage(){
        return null;
    }


}
