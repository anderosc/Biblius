package ee.andero.Biblius_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import ee.andero.Biblius_backend.entity.Books;
import ee.andero.Biblius_backend.repository.BookRepository;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookRepository productRepository;
    //Controllers are to communicate with front
    //They includ API endpoints, where front will contact 
    //localhost 8090/products -> testing
    @GetMapping("books")
    public List<Books> getBooks() {
        return productRepository.findAll();
    }

    @PostMapping("books")
    public List<Books> saveBooks(@RequestBody Books product) {
        productRepository.save(product); //Behind the scenes: INSERT values INTO pictures
        return productRepository.findAll(); //Behind the scenes: SELECT * FROM pictures

    }
    @PostMapping("add-all-products")
    public List<Books> saveAllBooks(@RequestBody List<Books> products) {
        productRepository.saveAll(products); //Behind the scenes: INSERT values INTO pictures
        return productRepository.findAll(); //Behind the scenes: SELECT * FROM pictures
    }
    //@RequestParam  localhost:8090/product?id=5
    //@PathVariable  localhost:8090/product/5

    @GetMapping("book")
    public Books getBooks(@RequestParam Long id) {
     return productRepository.findById(id).orElse(new Books());
    }
    @PutMapping("books")
    public List<Books> editBooks(@RequestBody Books product) {
        if(productRepository.findById(product.getId()).isPresent()){
            productRepository.save(product);
        }
        return productRepository.findAll();
    }

    //localhost:8080/product?category=electronics
    @GetMapping("book-by-category")
    public List<Books> getBooksByCategor(@RequestParam String category) {
        return productRepository.findByCategory(category);
    }

    @DeleteMapping("books")
    public List<Books> deleteBooks(@RequestParam Long id) {
         productRepository.deleteById(id);
         return productRepository.findAll();
    }

}
