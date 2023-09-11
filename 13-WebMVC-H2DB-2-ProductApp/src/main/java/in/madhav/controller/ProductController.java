package in.madhav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.madhav.entiry.Product;
import in.madhav.repo.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository repo;
	//load index page with some fields
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("p", new Product());
		
		return "index";
		
		
	}
	//to save records
	@PostMapping("/product")
	public String handleSave(@ModelAttribute("p")   Product pro,Model model) {
		
		pro=repo.save(pro);
		
		if(pro.getPid()!=null) {
			model.addAttribute("msg", "Product saved....");
		}
		
		model.addAttribute("p", new Product());
		return "index";
	}
	
	//to display records 
	
	@GetMapping("/products")
	public String displayRecords(Model model) {
		
		model.addAttribute("product", repo.findAll());
		return "data";
	}

}
