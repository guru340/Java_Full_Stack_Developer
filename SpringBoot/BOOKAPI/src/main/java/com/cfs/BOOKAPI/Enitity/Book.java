package com.cfs.BOOKAPI.Enitity;

public class Book {

    private long id;
    private double price;
    private String author;
    private String title;

    public Book(){

    }

    public Book(long id, double price, String author, String title) {
        this.id = id;
        this.price = price;
        this.author = author;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
