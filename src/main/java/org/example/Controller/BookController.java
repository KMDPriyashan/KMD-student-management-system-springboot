package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.BookDTO;
import org.example.Services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("book")
@CrossOrigin
public class BookController {

    final BookService service;

    @PostMapping("/add")
    public void addBook(@RequestBody BookDTO bookDTO){
        service.addBook(bookDTO);
    }

    @GetMapping("/get/{id}")
    public BookDTO getBookById(@PathVariable Integer id){
        return service.getBookById(id);
    }

    @GetMapping("/get-all")
    public List<BookDTO> getAllBook(){
        return service.getAllBook();
    }

    @PostMapping("/update")
    public void updateBook(BookDTO bookDTO){
        service.updateBook(bookDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBookById(@PathVariable Integer id){
        service.deleteBookById(id);
    }

}
