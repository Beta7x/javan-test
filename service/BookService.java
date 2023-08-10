package com.javan.perpustakaan.service;

import java.util.List;

import com.javan.perpustakaan.entity.Book;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBook();

    Book getBookById(Long id);
    
    Book updateBookById(Long id, Book book);
    
    String deleteBookById(Long id);
}
