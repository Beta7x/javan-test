package com.javan.perpustakaan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javan.perpustakaan.entity.Book;
import com.javan.perpustakaan.service.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
        return bookService.updateBookById(id, book);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") Long id) {
        return bookService.deleteBookById(id);
    }
}
