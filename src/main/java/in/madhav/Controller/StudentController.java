package in.madhav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.madhav.binding.Student;
import in.madhav.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/")
	public String loadPage(Model model) {
		
		
		formInitBinding(model);
		
		return "index";
	}
	private void formInitBinding(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("timings",service.getTimings());
	}
	
	@PostMapping("/save")
	public String saveStudent(Student s,Model model) {
		boolean isSave=service.saveStudent(s);
		if(isSave) {
		model.addAttribute("msg", "Data Saved...");
		}
		
		
		formInitBinding(model);
		
		return "index";
	}
	

}
