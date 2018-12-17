/**
 * @(#)Index.java 2018. 12. 17
 * <p>
 * Copyright 2018 Naver Corp. All rights Reserved.
 * Naver PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package io.github.chanhyeong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Cho Chanhyeong
 */
@Controller
public class Index {

	@GetMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}