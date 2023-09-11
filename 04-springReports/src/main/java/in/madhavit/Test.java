package in.madhavit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.madhav.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	ServiceRepo srp=ctx.getBean(ServiceRepo.class);
	srp.infoGenereate();
	
	}

}
