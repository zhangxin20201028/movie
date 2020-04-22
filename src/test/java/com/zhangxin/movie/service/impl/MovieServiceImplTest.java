package com.zhangxin.movie.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.zhangxin.movie.domain.Movie;
import com.zhangxin.movie.service.MovieService;
import com.zhangxin.movie.vo.MovieVo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ="classpath:spring-beans.xml")
public class MovieServiceImplTest {
	@Resource
	private MovieService service;
	@Test
	public void testSelects() {
		PageInfo<Movie> selects = service.selects(new MovieVo(), 1, 3);
		System.out.println(selects);
	}

}
