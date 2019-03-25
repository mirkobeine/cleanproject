package de.dhbw;

import de.dhbw.cleanproject.domain.book.Book;
import de.dhbw.cleanproject.domain.book.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class CleanProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BookRepository repository) {
        return (args) -> {
            repository.save(new Book("978-3-86680-192-9", "Der Winterkönig", "Bernard Cornwell", LocalDate.of(1996, 01, 01)));
        };
    }

}
