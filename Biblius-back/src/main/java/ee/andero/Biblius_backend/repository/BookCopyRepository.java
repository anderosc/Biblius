package ee.andero.Biblius_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ee.andero.Biblius_backend.entity.BookCopy;
import ee.andero.Biblius_backend.entity.CopyStatus;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long> {
    List<BookCopy> findByStatus(CopyStatus status);
    List<BookCopy> findByBookId(Long bookId);
    long countByBookIdAndStatus(Long bookId, CopyStatus status);
}
