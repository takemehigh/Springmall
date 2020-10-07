package com.wg.springmall.controller.admin;

import com.sun.javafx.collections.MappingChange;
import com.wg.springmall.config.shiro.ShiroConfig;
import com.wg.springmall.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller()
@RequestMapping("/admin")
public class LoginController extends BaseController{
    @GetMapping("/login")
    public String login(){
        return "admin/page/login/login";
    }

    @PostMapping("/login")
    public String login(ModelMap mmap, @RequestParam String userName, @RequestParam String password, @RequestParam String code, ModelMap resultmap ){
        System.out.println(userName+" "+password+" "+code);
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
            resultmap.put("user",(SysUser)subject.getPrincipal());
            return "redirect:/admin/index";
        }
        catch (Exception e){
            mmap.put("errmsg",e.getMessage());
            return "admin/page/login/login";
        }

    }

    @GetMapping({"/main", "/main.html"})
    public String main(HttpServletRequest request) {
        request.setAttribute("path", "index");
        return "admin/main";
    }

    @GetMapping({"/", "/index", "/index.html"})
    public String index(HttpServletRequest request) {
        request.setAttribute("path", "index");
        return "admin/index";
    }
}
