package de.dhbw.plugins.persistence.hibernate.book;

import de.dhbw.cleanproject.domain.book.Book;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<Book, UUID> {

    List<Book> findBookByIsbn(final String isbn);

}
