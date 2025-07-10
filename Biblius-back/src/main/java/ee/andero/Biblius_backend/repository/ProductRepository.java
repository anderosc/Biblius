package ee.andero.Biblius_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.andero.Biblius_backend.entity.Product;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}
