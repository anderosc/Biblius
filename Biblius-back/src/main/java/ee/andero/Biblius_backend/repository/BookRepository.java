package ee.andero.Biblius_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.andero.Biblius_backend.entity.Books;

import java.util.List;


public interface BookRepository extends JpaRepository<Books, Long> {
    List<Books> findByCategory(String category);
}
