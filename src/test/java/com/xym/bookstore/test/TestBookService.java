package com.xym.bookstore.test;

import static org.junit.Assert.*;
import com.xym.bookstore.entities.Book;
import com.xym.bookstore.service.BookService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @ClassName TestBookService
 * @Description TODO
 * @Author ak
 * @Date 2018/11/18 上午11:37
 * @Version 1.0
 **/
public class TestBookService {

    static BookService bookService;

//    https://blog.csdn.net/anders_zhuo/article/details/8955226 @BeforeClass用法
    @BeforeClass
    public static void before(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        bookService=ctx.getBean(BookService.class);
    }

    @Test
    public void testGetAllBooks(){
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println(allBooks);
    }

    @Test
    public void testAdd(){
        Book book = new Book(0, "Hibernate 第七版", 78.1, new Date());
        try {
            assertEquals(1,bookService.add(book));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteInt() {
        assertEquals(1, bookService.delete(9));
    }

    @Test
    public void testDeleteStringArray(){
        String[] ids = {"12", "13"};
        assertEquals(2,bookService.delete(ids));
    }

    @Test
    public void testGetBookById(){
        assertNotNull(bookService.getBookById(1));
    }

    @Test
    public void testAddDouble(){
        //因为书名相同，添加第二本会失败，用于测试事务
        Book book1=new Book(0, "Hibernate 第八版", 78.1, new Date());
        Book book2=new Book(0, "Hibernate 第九版", 78.1, new Date());
        assertEquals(2, bookService.add(book1, book2));
    }
}