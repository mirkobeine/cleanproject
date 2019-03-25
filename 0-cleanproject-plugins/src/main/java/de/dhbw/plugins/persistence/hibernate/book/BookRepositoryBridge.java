package de.dhbw.plugins.persistence.hibernate.book;

import de.dhbw.cleanproject.domain.book.Book;
import de.dhbw.cleanproject.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepositoryBridge implements BookRepository {

    private SpringDataBookRepository springBookRepository;

    @Autowired
    public BookRepositoryBridge(SpringDataBookRepository springBookRepository) {
        this.springBookRepository = springBookRepository;
    }

    @Override
    public List<Book> findAll() {
        return this.springBookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return this.springBookRepository.save(book);
    }
}
