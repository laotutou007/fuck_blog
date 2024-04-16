package com.jimmy.holydemo.controller;

import com.jimmy.holydemo.entity.Article;
import com.jimmy.holydemo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/test")
    public List<Article> test(){
        return articleService.list();
    }
}
