package com.xym.bookstore.service;

import com.xym.bookstore.entities.Book;
import com.xym.bookstore.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author ak
 * @Date 2018/11/18 上午11:29
 * @Version 1.0
 **/

@Service
public class BookService {

    @Autowired
    @Qualifier("bookMapper")
//    @Resource 使用Resource注解无法注入？
    BookMapper bookMapper;

//    public void setBookMapper(BookMapper bookMapper) {
//        this.bookMapper = bookMapper;
//    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }

    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    public int add(Book book) throws Exception {
        if(book.getTitle()==null || book.getTitle().equals("")){
            throw new Exception("书名必须不为空");
        }
        return bookMapper.add(book);
    }

    @Transactional
    public int add(Book book1, Book book2) {
        int rows = 0;
        rows += bookMapper.add(book1);
        rows += bookMapper.add(book2);
        return rows;
    }

    public int delete(int id) {
        return bookMapper.delete(id);
    }

    public int delete(String[] ids) {
        int rows = 0;
        for (String id : ids) {
            rows += delete(Integer.parseInt(id));
        }
        return rows;
    }

    public int update(Book book) {
        return bookMapper.update(book);
    }
}