package com.example.BookCrud;

import com.example.BookCrud.model.Book;
import com.example.BookCrud.repository.BookRepository;
import com.example.BookCrud.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    BookRepository bookRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void getAllBooks() {
        List<Book> books = new ArrayList<>();
        when(bookRepository.findAll()).thenReturn(books); 
        assertEquals(books, bookService.getAllBooks());      
    } 

    @Test
    void getBook() {
        Book book = new Book();
        when(bookRepository.findById("123")).thenReturn(Optional.of(book));
        assertEquals(book, bookService.getBook("123"));
    }

    @Test
    void create() {
        Book book = new Book();
        when(bookRepository.save(book)).thenReturn(book);
        assertEquals(book, bookService.create(book));
    }

    @Test
    void delete() {
        doNothing().when(bookRepository).deleteById("123");
        bookService.delete("123");
    }

    @Test
    void update() {
        Book book = new Book();
        when(bookRepository.findById("123")).thenReturn(Optional.of(book));
        when(bookRepository.save(book)).thenReturn(book);
        assertEquals(book, bookService.update(book, "123"));
    }

    @Test
    void deleteAll() {
        doNothing().when(bookRepository).deleteAll();
        bookService.deleteAll();
    }
}
