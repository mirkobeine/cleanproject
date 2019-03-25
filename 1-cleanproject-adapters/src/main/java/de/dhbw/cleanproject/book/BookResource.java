package de.dhbw.cleanproject.book;

public class BookResource {

    private String isbn;

    private String title;

    private String author;

    private Integer yearOfPublication;

    public BookResource(String isbn, String title, String author, Integer yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }
}
