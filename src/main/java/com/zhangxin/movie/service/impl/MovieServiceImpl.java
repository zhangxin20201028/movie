package com.zhangxin.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangxin.movie.dao.MovieMapper;
import com.zhangxin.movie.domain.Movie;
import com.zhangxin.movie.service.MovieService;
import com.zhangxin.movie.vo.MovieVo;
@Service
public class MovieServiceImpl implements MovieService{
	@Resource
	private MovieMapper moviemapper;
	@Override
	public PageInfo<Movie> selects(MovieVo movieVo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Movie> list=moviemapper.selects(movieVo);
		PageInfo<Movie> info=new PageInfo<Movie>(list);
		return info;
	}

}
