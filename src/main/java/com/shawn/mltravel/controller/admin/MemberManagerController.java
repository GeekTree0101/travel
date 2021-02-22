package com.shawn.mltravel.controller.admin;
import com.shawn.mltravel.pojo.User;
import com.shawn.mltravel.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberManagerController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/member")
    public String list()
    {
        return "travel/admin/user-list";
    }
    @RequestMapping("/addMember")
    public String addMember()
    {
        return "travel/user/member-add";
    }
    @RequestMapping("/deleteMember")
    public String deleteMember()
    {
        return "travel/user/member-delete";
    }
    @RequestMapping("/memberLevel")
    public String memberLevel()
    {
        return "travel/user/member-level";
    }
    @GetMapping("/queryUserList")
    public List<User> queryUserList(Model model) {
        List<User> userList = userService.queryUserList();
        model.addAttribute("users",userList);
        return userList;
    }
}
