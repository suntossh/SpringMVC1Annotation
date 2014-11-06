package com.suntossh.hellocontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("/welcome")
	protected ModelAndView handleRequestOne() throws Exception {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", "Hari Bol Suntossh, Annotation based MVC Call");
		return modelAndView;
	}
	
	@RequestMapping("/welcome2")
	protected ModelAndView handleRequestTwo() throws Exception {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", "Hari Bol Suntossh, Annotation based MVC Call 2");
		return modelAndView;
	}

}
