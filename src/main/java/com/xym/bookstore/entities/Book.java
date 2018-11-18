package com.xym.bookstore.entities;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author ak
 * @Date 2018/11/18 上午11:05
 * @Version 1.0
 **/
public class Book {
    private int id;
    private String title;
    private double price;
    private Date publishDate;

    public Book() {
    }

    public Book(int id, String title, double price, Date publishDate) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}