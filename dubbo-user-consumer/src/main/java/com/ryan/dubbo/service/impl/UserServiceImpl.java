package com.ryan.dubbo.service.impl;

import com.ryan.dubbo.bean.Movie;
import com.ryan.dubbo.bean.Order;
import com.ryan.dubbo.bean.User;
import com.ryan.dubbo.service.MovieService;
import com.ryan.dubbo.service.UserInterface;

public class UserServiceImpl implements UserInterface {

    MovieService movieService;

    @Override
    public Order buyNewMovie(User user) {
        //1.远程查询最新电影并返回
        Movie movie = movieService.getNewMovie();
        System.out.println("远程调用movie服务获得到结果： "+movie);

        //2.封装order对象并返回
        Order order = new Order();
        order.setUserName(user.getUserName());
        order.setMovieId(movie.getId());
        order.setMovieName(movie.getMovieName());

        return order;
    }
}
