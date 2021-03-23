package de.dhbw.plugins.persistence.hibernate.character;

import de.dhbw.cleanproject.domain.character.Character;
import de.dhbw.cleanproject.domain.character.CharacterRepository;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CharacterRepositoryBridge implements CharacterRepository {

    private final JPASpringCharacterRepository jpaSpringCharacterRepository;

    @Autowired
    public CharacterRepositoryBridge(JPASpringCharacterRepository jpaSpringCharacterRepository) {
        this.jpaSpringCharacterRepository = jpaSpringCharacterRepository;
    }

    @Override
    public Character save(Character character) {
        return this.jpaSpringCharacterRepository.save(character);
    }

    @Override
    public List<Character> findAll() {
        return this.jpaSpringCharacterRepository.findAll();
    }

    @Override
    public Optional<Character> findbyName(String name) {
        Validate.notBlank(name);
        return this.jpaSpringCharacterRepository.findByName(name);
    }
}
