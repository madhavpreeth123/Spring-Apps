package in.madhav.reo;

import org.springframework.data.repository.CrudRepository;

import in.madhav.entity.Book;

public interface BookRepo  extends CrudRepository<Book,Integer> {
	
	

}
