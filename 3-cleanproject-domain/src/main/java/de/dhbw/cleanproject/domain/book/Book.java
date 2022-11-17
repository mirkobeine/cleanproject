package de.dhbw.cleanproject.domain.book;

import java.util.UUID;
import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year_of_publication")
    private LocalDate yearOfPublication;

    protected Book() {
        //default constructor for JPA
    }

    public Book(final String isbn, final String title, final String author, final LocalDate yearOfPublication) {
        Validate.notBlank(isbn);
        Validate.notBlank(title);
        Validate.notBlank(author);
        Validate.notNull(yearOfPublication);

        this.id = UUID.randomUUID();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public UUID getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }
}
