package de.dhbw.cleanproject.application.book;

import de.dhbw.cleanproject.domain.book.Book;
import de.dhbw.cleanproject.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookApplicationService {

    private final BookRepository bookRepository;
    @Autowired
    public BookApplicationService(final BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAllBooks() {
        return this.bookRepository.findAllBooks();
    }
}
