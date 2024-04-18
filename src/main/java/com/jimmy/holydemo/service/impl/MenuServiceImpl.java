package com.jimmy.holydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jimmy.holydemo.dao.MenuDao;
import com.jimmy.holydemo.entity.Menu;
import com.jimmy.holydemo.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2024-04-16 14:18:43
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements MenuService {
}

