package ee.andero.Biblius_backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BookCopy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String barcode; // unikaalne triipkood
    private String location;
    
    @Enumerated(EnumType.STRING)
    private CopyStatus status;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;

    // Laenutaja info (vajadusel null, kui pole laenutatud)
    private Long borrowedByUserId;
    private LocalDateTime borrowedAt;
    private LocalDateTime dueDate;
}
