package in.madhav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcome(Model model) {
		
		model.addAttribute("msg", "Welcome-Thymeleafe");
		
		return "index";
	}

}
