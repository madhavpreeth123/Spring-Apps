package in.madhav.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.madhav.entity.Book;

public interface BookRepositery extends CrudRepository<Book, Integer>{
	
	
	 //public List<Book> findByBookPriceGreaterThan(Double price);
	
	//@Query(value="select* from book",nativeQuery = true)
	//public List<Book> getBooks();
	
	@Query("from Book")
	public List<Book> getBook();
	
} 
