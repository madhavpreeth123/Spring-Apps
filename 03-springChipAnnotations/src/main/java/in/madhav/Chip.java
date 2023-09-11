package in.madhav;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		// TODO Auto-generated constructor stub
	System.out.println("chip:constructor");
	}
	
	public String type() {
		
		return "32-bit";
	}
	

}
