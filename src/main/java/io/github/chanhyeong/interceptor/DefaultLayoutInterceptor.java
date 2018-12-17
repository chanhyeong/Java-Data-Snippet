package io.github.chanhyeong.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Thymeleaf 에 기본으로 적용할 레이아웃 설정해주는 인터셉터
 *
 * @author Cho Chanhyeong
 */
@Component
public class DefaultLayoutInterceptor implements HandlerInterceptor {

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception{
		if (request == null || response == null || mv == null) {
			return;
		}
	}
}