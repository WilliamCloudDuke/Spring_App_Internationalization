package com.mum.edu.demo;

//import java.util.Date;
//import javax.validation.constraints.Past;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.EAN;

public class Book {

    private int id;
    @NotBlank
    private String title;
    @Pattern(regexp = "\\d{3}-\\d{10}", message = "must be formatted as ISBN")
    private String ISBN;
    @NotBlank
    private String author;
    @Min(0)
    private double price;
//    @Past
//    private Date published;

    public Book() {
        super();
    }

    public Book(String title, String iSBN, String author, double price/*, Date published*/) {
        super();
        this.title = title;
        ISBN = iSBN;
        this.author = author;
        this.price = price;
//        this.published = published;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Date getPublished() {
//        return published;
//    }
//
//    public void setPublished(Date published) {
//        this.published = published;
//    }

}
