package de.dhbw.cleanproject.domain.character;

import java.util.List;
import java.util.Optional;

public interface CharacterRepository {

    Character save(Character character);

    List<Character> findAll();

    Optional<Character> findbyName(String name);
}
