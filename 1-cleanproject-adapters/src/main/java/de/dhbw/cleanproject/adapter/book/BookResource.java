package de.dhbw.cleanproject.adapter.book;

public class BookResource {

    private final String isbn;

    private final String title;

    private final String author;

    private final Integer yearOfPublication;

    public BookResource(final String isbn, final String title, final String author, final Integer yearOfPublication) {
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
