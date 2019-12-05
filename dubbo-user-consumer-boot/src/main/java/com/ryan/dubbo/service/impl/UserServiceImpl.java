package com.ryan.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ryan.dubbo.bean.Movie;
import com.ryan.dubbo.bean.Order;
import com.ryan.dubbo.bean.User;
import com.ryan.dubbo.service.MovieService;
import com.ryan.dubbo.service.UserService;
import org.springframework.stereotype.Service;

@Service
//将UserServie加到容器中
public class UserServiceImpl implements UserService {

    @Reference //远程调用服务
    MovieService movieService;

    public MovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

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
