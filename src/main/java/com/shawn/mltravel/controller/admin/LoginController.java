package com.shawn.mltravel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/admin/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session)
    {

        if("admin".equals(username) && "123456".equals(password))
        {
            session.setAttribute("adminLoginUser",username);
            return "redirect:/admin.html";
        }
        else
        {
            model.addAttribute("msg","用户名或者密码错误");
            return "travel/admin/login";
        }
    }
}
