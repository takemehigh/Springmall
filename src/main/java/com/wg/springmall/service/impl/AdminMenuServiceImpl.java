package com.wg.springmall.service.impl;

import com.wg.springmall.entity.AdminMenu;
import com.wg.springmall.dao.AdminMenuMapper;
import com.wg.springmall.service.AdminMenuService;
import com.wg.springmall.util.PageQueryUtil;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminMenuServiceImpl implements AdminMenuService {
    AdminMenuMapper adminMenuMapper;

    @Override
    public List<AdminMenu> selectAdminMenu(PageQueryUtil param) {
        return null;
    }

    @Override
    public int selectAdminMenuCount(PageQueryUtil param) {
        return 0;
    }
}
