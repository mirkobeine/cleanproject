package de.dhbw.cleanproject.domain.book;

import java.util.List;

public interface BookRepository {

    List<Book> findAllBooks();

    Book save(Book book);
}
