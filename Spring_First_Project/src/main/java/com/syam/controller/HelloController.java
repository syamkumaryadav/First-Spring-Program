package com.syam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
@RequestMapping("/sayHello")
public ModelAndView sayHello() {
ModelAndView mv = new ModelAndView();
mv.setViewName("/WEB-INF/views/hello.jsp");
return mv;
}
}