package com.xym.bookstore.mapper;

import com.xym.bookstore.entities.Book;

import java.util.List;

public interface BookMapper {
    List<Book> getAllBooks();

    Book getBookById(int id);

    int add(Book book);

    int delete(int id);

    int update(Book book);
}
