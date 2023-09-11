package in.madhav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		Car c=ctx.getBean(Car.class);
		c.drive();
	}

}
