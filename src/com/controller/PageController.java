package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 11111
 * @author Administrator
 *
 */
@Controller
public class PageController {

	@RequestMapping("/toIndex")
	public String showIndex() {
		return "/index";
	}
	
	@RequestMapping("{toPage}")
	public String showAll(@PathVariable String toPage) {
		return toPage;
	}
}
