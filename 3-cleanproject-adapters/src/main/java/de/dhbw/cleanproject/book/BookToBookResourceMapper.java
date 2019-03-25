package de.dhbw.cleanproject.book;

import de.dhbw.cleanproject.domain.book.Book;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class BookToBookResourceMapper implements Function<Book, BookResource> {

    @Override
    public BookResource apply(Book book) {
        return map(book);
    }

    private BookResource map(Book book) {
        return new BookResource(book.getIsbn(), book.getTitle(), book.getAuthor(), book.getYearOfPublication().getYear());
    }
}
