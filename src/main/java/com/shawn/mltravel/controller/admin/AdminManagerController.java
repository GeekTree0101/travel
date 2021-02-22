package com.shawn.mltravel.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminManagerController {

    @RequestMapping("/admin")
    public String list()
    {
        return "travel/admin/admin-list";
    }
    @RequestMapping("/admin-rule")
    public String listRule()
    {
        return "travel/admin/admin-rule";
    }
}
