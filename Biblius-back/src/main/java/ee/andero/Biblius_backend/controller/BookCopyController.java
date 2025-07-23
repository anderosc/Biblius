package ee.andero.Biblius_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ee.andero.Biblius_backend.entity.BookCopy;
import ee.andero.Biblius_backend.repository.BookCopyRepository;

@RestController
@RequestMapping("/book-copies")
public class BookCopyController {
    


    @Autowired
    private BookCopyRepository bookcopyrepository;

    @GetMapping("")
    public List<BookCopy> getBooksCopies(){
        return bookcopyrepository.findAll();
    }
}
