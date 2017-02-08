package com.praveen.soni.hello.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PraveenHelloController {
	
	@RequestMapping("/")
	 public String hello(HttpServletRequest request) {
        //modelAndView.addObject("praveen", "praveen soni");
		request.setAttribute("praveen", "praveen soni");
		return "/jsp/helloWorldView.jsp";
	}
	


}
