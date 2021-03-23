package de.dhbw.plugins.persistence.hibernate.character;

import de.dhbw.cleanproject.domain.character.Character;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JPASpringCharacterRepository extends JpaRepository<Character, Long> {

    public Optional<Character> findByName(String name);
}
