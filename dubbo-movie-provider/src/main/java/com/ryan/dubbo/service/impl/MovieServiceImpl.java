package com.ryan.dubbo.service.impl;

import com.ryan.dubbo.bean.Movie;
import com.ryan.dubbo.service.MovieService;

public class MovieServiceImpl implements MovieService {

    /**
     * 应用dubbo的步骤
     * 1.引入dubbo的依赖和操作zk的客户端
     * 2.
     * @return
     */

    @Override
    public Movie getNewMovie() {

        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("复联4");
        movie.setPrice(96.99);
        System.out.println("电影服务查询到最新的电影: "+ movie.getMovieName());
        return movie;
    }
}
