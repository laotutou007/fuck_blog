package com.jimmy.holydemo.controller;

import com.jimmy.holydemo.entity.Menu;
import com.jimmy.holydemo.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Slf4j
public class HelloTest {
    @Autowired
    private MenuService menuService;
    @GetMapping("/d")
    public Menu ok(){
        Menu byId = menuService.getById(1);
        return byId;
    }
}
