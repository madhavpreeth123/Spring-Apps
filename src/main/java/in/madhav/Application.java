package in.madhav;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.madhav.dao.BookRepositery;
import in.madhav.entity.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
		=SpringApplication.run(Application.class, args);
		BookRepositery repo=ctx.getBean(BookRepositery.class);
		
//	Book b=new Book();
//		b.setBookId(102);
//		b.setBookName("python");
//		b.setBookPrice(2000.0);
//		
//		repo.save(b);
//		System.out.println("records inserted....");
//		
//		Optional<Book> l =repo.findById(100);
//		System.out.println( l.get());
		
	//	repo.deleteById(101);
		
//		Iterable<Book> it=repo.findAll();
//		for(Book bb:it) {
//			System.out.println(bb);
//		}
//	
		/* findd by method*/
//		List<Book> it=repo.findByBookPriceGreaterThan(1000.0);
//		
//		for(Book books:it) {
//			System.out.println(books);
//		}              
		
		List<Book> it=repo.getBook();
		for(Book books:it) {
			System.out.println(books);
	}
		
	}

}
