package in.madhav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("msg", "this is my first msg in web mvc");
		mv.setViewName("msg");
		
		return mv;
	}
	
	@GetMapping("/greet")
	public ModelAndView greet() {
		
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("msg", "gud mrng madhav");
		mv.setViewName("msg");
		return mv;
	}

}
