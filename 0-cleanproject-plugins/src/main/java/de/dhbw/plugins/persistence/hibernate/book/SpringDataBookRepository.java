package de.dhbw.plugins.persistence.hibernate.book;

import de.dhbw.cleanproject.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataBookRepository extends JpaRepository<Book, Long> {
}
