package ee.andero.Biblius_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Entity
@Getter
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    @Column(columnDefinition = "varchar(1000)")
    private String description;
    private String category;
    private String image;
    
    private boolean active;

    private String isbn;
    private int publishedYear;
    private String publisher;
    private String language;
    private int pages;
    private int availableCopies;
    private int totalCopies;
    private String location;
}
