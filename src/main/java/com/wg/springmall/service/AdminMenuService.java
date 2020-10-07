package com.wg.springmall.service;

import com.wg.springmall.entity.AdminMenu;
import com.wg.springmall.util.PageQueryUtil;

import java.util.List;

public interface AdminMenuService {

    public List<AdminMenu> selectAdminMenu(PageQueryUtil param);

    public int selectAdminMenuCount(PageQueryUtil param);

}
