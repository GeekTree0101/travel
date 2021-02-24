package com.shawn.mltravel.controller.user;

import com.shawn.mltravel.pojo.User;
import com.shawn.mltravel.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/member-list.html")
    public String queryUserList(Model model) {
        List<User> userList = userService.queryUserList();
        model.addAttribute("userList", userList);
        return "travel/user/member-list";
    }

    @PostMapping("/addMember")
    public String addMember(User user)
    {
        userService.addUser(user);
        return "redirect:/member-list.html";
    }
    @PostMapping("/updateMember")
    public String updateMember(User user)
    {
        User userById = userService.queryUserById(user.getId());
        System.out.println(userById);
        userService.updateUser(user);
        return "redirect:/member-list.html";
    }

}