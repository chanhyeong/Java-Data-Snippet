package io.github.chanhyeong.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Cho Chanhyeong
 */
@Slf4j
@Controller
public class Index {
	@Value("${snoopy.commit.test}")
	private int val;

	@GetMapping("/")
	public ModelAndView index() {
		log.info(Integer.toString(val));
		return new ModelAndView("index");
	}
}