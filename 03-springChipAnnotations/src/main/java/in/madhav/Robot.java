package in.madhav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private Chip chip;
	
	public Robot() {
		// TODO Auto-generated constructor stub
		System.out.println("Robot:comstructor");
	}
	public void doWork() {
		
		String type=chip.type();
		
		if(type.equals("32-bit")) {
			System.out.println("perfomance is slow");
		}
		
		
	}
	
	
	
	
	
	

}
