package de.dhbw.cleanproject.domain.book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Book save(Book book);
}
