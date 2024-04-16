package com.jimmy.holydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jimmy.holydemo.dao.ArticleDao;
import com.jimmy.holydemo.entity.Article;
import com.jimmy.holydemo.service.ArticleService;
import org.springframework.stereotype.Service;

@Service("articleService")
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService{
}
