package com.ryan.dubbo.controller;

import com.ryan.dubbo.bean.Order;
import com.ryan.dubbo.bean.User;
import com.ryan.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/hello")
    public Object hello() {
        User user = new User();
        user.setId(2);
        user.setUserName("lisinag");
        Order order = userService.buyNewMovie(user);
        return order;
    }
}
