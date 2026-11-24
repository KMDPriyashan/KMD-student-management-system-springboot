package org.example.Services.impl;

import lombok.RequiredArgsConstructor;
import org.example.Entity.BookEntity;
import org.example.Model.BookDTO;
import org.example.Repository.BookRepository;
import org.example.Services.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceimpl implements BookService {

    final BookRepository repository;

    @Override
    public void addBook(BookDTO bookDTO) {
        ModelMapper mapper = new ModelMapper();
        BookEntity bookEntity = mapper.map(bookDTO,BookEntity.class);
        repository.save(bookEntity);
        System.out.println(bookDTO);
    }

    @Override
    public BookDTO getBookById(Integer id) {
        return new ModelMapper().map(repository.findById(id), BookDTO.class);
    }

    @Override
    public List<BookDTO> getAllBook() {
        Iterable<BookEntity> all = repository.findAll();
        List<BookDTO> bookDTOList = new ArrayList<>();
        all.forEach(bookEntity ->
                bookDTOList.add(new ModelMapper().map(bookEntity,BookDTO.class)));
        return bookDTOList;
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        ModelMapper mapper = new ModelMapper();
        BookEntity bookEntity = mapper.map(bookDTO,BookEntity.class);
        repository.save(bookEntity);

    }

    @Override
    public void deleteBookById(Integer id) {
        repository.deleteById(id);

    }
}
