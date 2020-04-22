package com.zhangxin.movie.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.zhangxin.movie.domain.Movie;
import com.zhangxin.movie.service.MovieService;
import com.zhangxin.movie.vo.MovieVo;

@Controller
public class MovieController {

	@Resource
	private MovieService service;
	
	@RequestMapping("selects")
	public String selects(Model model,MovieVo MovieVo,
			@RequestParam(defaultValue ="1")Integer pageNum,
			@RequestParam(defaultValue ="3")Integer pageSize) {
		PageInfo<Movie> info = service.selects(MovieVo, pageNum, pageSize);
		model.addAttribute("info", info);
		model.addAttribute("MovieVo", MovieVo);
		System.out.println(MovieVo);
		return "movies";
	}
}
