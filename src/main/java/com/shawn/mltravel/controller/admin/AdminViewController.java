package com.shawn.mltravel.controller.admin;

import org.springframework.stereotype.Controller;
import com.shawn.mltravel.pojo.User;
import com.shawn.mltravel.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AdminViewController {

  @Autowired
  UserServiceImpl userService;

  @GetMapping("/admin-list.html")
  public List<User> queryUserList(Model model) {
      List<User> userList = userService.queryUserList();
      model.addAttribute("userList", userList);
      return "travel/admin/admin-list"
  }
}