package com.ryan.dubbo.service;

import com.ryan.dubbo.bean.Order;
import com.ryan.dubbo.bean.User;

public interface UserService {
    public Order buyNewMovie(User user);
}
