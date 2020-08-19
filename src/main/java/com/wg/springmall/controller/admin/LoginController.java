package com.wg.springmall.controller.admin;

import org.springframework.stereotype.Controller;
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
    public String login(@RequestParam String userName,@RequestParam String password,@RequestParam String code){
        System.out.println(userName+" "+password+" "+code);
        return "redirect:/admin/index";
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
