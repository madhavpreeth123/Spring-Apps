package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		UserDao c=ctx.getBean(UserDao.class);
		c.getData();
	}
	

}
