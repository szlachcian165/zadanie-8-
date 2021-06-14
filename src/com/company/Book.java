package com.company;

import java.time.LocalDateTime;
import java.util.List;

public class Book {

    private String title;
    private float price;
    private LocalDateTime releaseDate;
    private List<String> authors;
    private Genre genre;

    public Book(String title, float price, LocalDateTime releaseDate, List<String> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.releaseDate = releaseDate;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
