package org.example.Services;

import org.example.Model.BookDTO;

import java.util.List;

public interface BookService {
    void addBook(BookDTO bookDTO);
    BookDTO getBookById(Integer id);
    List<BookDTO> getAllBook();
    void updateBook(BookDTO bookDTO);
    void deleteBookById(Integer id);
}
