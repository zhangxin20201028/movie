package com.zhangxin.movie.dao;

import java.util.List;

import com.zhangxin.movie.domain.Movie;
import com.zhangxin.movie.vo.MovieVo;

public interface MovieMapper {

	List<Movie> selects(MovieVo movieVo);

	
}
