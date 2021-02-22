package com.shawn.mltravel.controller.admin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderManagerController {

    @RequestMapping("/order")
    public String order()
    {
        return "travel/admin/order-list";
    }
    @RequestMapping("/order-add")
    public String orderAdd()
    {
        return "travel/admin/order-add";
    }
}
