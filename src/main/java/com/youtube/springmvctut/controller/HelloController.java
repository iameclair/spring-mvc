package com.youtube.springmvctut.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;


public class HelloController extends AbstractController
{
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
	throws Exception{
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hi Eclair");

		return modelAndView;
	}
}
