package com.zhangxin.movie.service;

import com.github.pagehelper.PageInfo;
import com.zhangxin.movie.domain.Movie;
import com.zhangxin.movie.vo.MovieVo;

public interface MovieService {

	PageInfo<Movie> selects(MovieVo movieVo,Integer pageNum,Integer pageSize);
}
