package de.dhbw.cleanproject.domain.book;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_book_id")
    @SequenceGenerator(name = "seq_book_id", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "year_of_publication")
    private LocalDate yearOfPublication;

    private Book() {
        //default constructor for JPA
    }

    public Book(String isbn, String title, String author, LocalDate yearOfPublication) {
        Validate.notBlank(isbn);
        Validate.notBlank(title);
        Validate.notBlank(author);
        Validate.notNull(yearOfPublication);

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

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getYearOfPublication() {
        return yearOfPublication;
    }
}
