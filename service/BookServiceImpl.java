package com.javan.perpustakaan.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javan.perpustakaan.entity.Book;
import com.javan.perpustakaan.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBook() {
        List<Book> allBooks = bookRepository.findAll();
        return allBooks;
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        if (book.isPresent()) book.get();
        return null;
    }

    @Override
    public Book updateBookById(Long id, Book book) {
        Optional<Book> oldBook = bookRepository.findById(id);

        if (oldBook.isPresent()) {
            Book originalBook = oldBook.get();

            if (Objects.nonNull(book.getBookName()) && !"".equalsIgnoreCase(book.getBookName())) {
                originalBook.setBookName(book.getBookName());

            }
            if (Objects.nonNull(book.getBookDetail()) && book.getBookDetail() != "") {
                originalBook.setBookDetail(book.getBookDetail());
            }
            return bookRepository.save(originalBook);
        }

        return null;
    }

    @Override
    public String deleteBookById(Long id) {
        if (bookRepository.findById(id).isPresent()) {
            bookRepository.deleteById(id);
            return "Book deleted successfully";
        }
        return "No such book in the database";
    }
}
