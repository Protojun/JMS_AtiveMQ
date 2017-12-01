package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.JmsClient;
import com.JmsClientImpl;


public class SendController implements Controller {

	private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
	
	private JmsClientImpl jmsClientImpl;

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.debug(" >>> sendController");
		
		jmsClientImpl.send("abc");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("message", "Hello Spring MVC");
		return mv;
	}
	
	public void setJmsClientImpl(JmsClientImpl jmsClientImpl) {
		this.jmsClientImpl = jmsClientImpl;
	}
}
