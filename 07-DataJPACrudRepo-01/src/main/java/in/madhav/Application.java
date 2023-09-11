package in.madhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.madhav.entity.Book;
import in.madhav.reo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntx=SpringApplication.run(Application.class, args);
		BookRepo repo=cntx.getBean(BookRepo.class);
		
		Book b=new Book();
		b.setBookId(100);
		b.setBookName("java");
		
		System.out.println("records inserted......");
		
	}

}
