package in.madhav.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhav.entiry.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
