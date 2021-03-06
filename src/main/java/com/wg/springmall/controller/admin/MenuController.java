package com.wg.springmall.controller.admin;

import com.wg.springmall.controller.vo.MenuVO;
import com.wg.springmall.service.AdminMenuService;
import com.wg.springmall.util.PageQueryUtil;
import com.wg.springmall.util.Result;
import com.wg.springmall.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller()
@RequestMapping("/admin/menu")
public class MenuController extends BaseController{
    public static String prefix="/admin/page/menu";
    @Resource
    AdminMenuService adminMenuService;
    @GetMapping("/getTop")
    @ResponseBody
    public Result getTop(){
        ArrayList<MenuVO> menulist=new ArrayList();
        MenuVO mv=new MenuVO();

        mv.setMenuCode("contentManagement");
        mv.setIcon("&#xe705");
        mv.setTitle("内容管理");
        menulist.add(mv);
        mv=new MenuVO();
        mv.setMenuCode("memberCenter");
        mv.setIcon("&#xe705");
        mv.setTitle("用户中心");
        menulist.add(mv);
        mv=new MenuVO();

        mv.setMenuCode("systemeSttings");
        mv.setIcon("&#xe705");
        mv.setTitle("系统设置");
        menulist.add(mv);
        mv=new MenuVO();

        mv.setMenuCode("seraphApi");
        mv.setIcon("&#xe705");
        mv.setTitle("使用文档");
        menulist.add(mv);
        mv=new MenuVO();

        mv.setMenuCode("menuManage");
        mv.setIcon("&#xe705");
        mv.setTitle("菜单管理");
        menulist.add(mv);
        return ResultGenerator.genSuccessResult(menulist);

    }

    @GetMapping("/manage")
    public String meneMange(){
        return prefix+"/menu";
    }

    @GetMapping("/list")
    @ResponseBody
    public Result list(@RequestParam Map params){
        if (StringUtils.isEmpty(params.get("page")) || StringUtils.isEmpty(params.get("limit"))) {
            return ResultGenerator.genFailResult("参数异常！");
        }
        PageQueryUtil pageQueryUtil=new PageQueryUtil(params);
        return ResultGenerator.genSuccessResult();
    }
}
