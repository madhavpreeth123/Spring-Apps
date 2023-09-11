package in.madhav;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashot.config.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext cnt=new AnnotationConfigApplicationContext(AppConfig.class);
	Robot r=cnt.getBean(Robot.class);
	r.doWork();
	}

}
