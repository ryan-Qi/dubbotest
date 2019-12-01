package com.ryan.dubbo.service.impl;

import com.ryan.dubbo.bean.User;
import com.ryan.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

        context.start();

        System.out.println("测试远程调用。。。。");

        UserService userService = context.getBean(UserService.class);
        User user = new User();
        user.setId(1);
        user.setUserName("aaa");
        userService.buyNewMovie(user);

        System.in.read();

    }
}
