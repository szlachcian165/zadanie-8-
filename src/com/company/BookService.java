package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> bookList;

    public BookService() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book){
        this.bookList.add(book);
    }

    public void removeBook(Book book){
        this.bookList.remove(book);
    }

    public List<Book> returnList(){
        return this.bookList;
    }

    public List<Book> returnFantasy(){
        List<Book> result = new ArrayList<>();
        for(Book b : this.bookList){
            if(b.getGenre() == Genre.Fantasy){
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> returnBooksBefore1999(){
        List<Book> result = new ArrayList<>();
        for(Book b: this.bookList){
            if(b.getReleaseDate().isBefore(LocalDateTime.of(1999,1,1,0,0))){
                result.add(b);
            }
        }
        return result;
    } 
    
    public Book returnMostExpensiveBook(){
        Book result = null;
        for(Book b: this.bookList){
            if(result == null || result.getPrice() < b.getPrice()){
                result = b;
            }
        }
        return result;
    }
    
    public Book returnLeastExpensiveBook(){
        Book result = null;
        for(Book b: this.bookList){
            if(result == null || result.getPrice() > b.getPrice()){
                result = b;
            }
        }
        return result;
    }
}
