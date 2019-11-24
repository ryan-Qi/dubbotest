package com.ryan.dubbo.service;

import com.ryan.dubbo.bean.Order;
import com.ryan.dubbo.bean.User;

public interface UserInterface {
    public Order buyNewMovie(User user);
}
