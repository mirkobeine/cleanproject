package de.dhbw.plugins.persistence.hibernate.book;

import de.dhbw.cleanproject.domain.book.Book;
import de.dhbw.cleanproject.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryBridge implements BookRepository {

    private SpringDataBookRepository springDataBookRepository;

    @Autowired
    public BookRepositoryBridge(SpringDataBookRepository springDataBookRepository) {
        this.springDataBookRepository = springDataBookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return this.springDataBookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return this.springDataBookRepository.save(book);
    }
}
