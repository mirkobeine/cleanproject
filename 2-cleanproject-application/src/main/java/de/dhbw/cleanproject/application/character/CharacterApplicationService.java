package de.dhbw.cleanproject.application.character;

import de.dhbw.cleanproject.application.character.command.CreateCharacterCommand;
import de.dhbw.cleanproject.domain.character.*;
import de.dhbw.cleanproject.domain.character.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterApplicationService {

    private CharacterRepository characterRepository;

    @Autowired
    public CharacterApplicationService(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void createCharacter(CreateCharacterCommand command) {

        Level lvl = new Level(command.getLevel());
        Initiative init = new Initiative(command.getInitiative());
        Character character = new Character(command.getName(), lvl, init);

        this.characterRepository.save(character);
    }

    public List<Character> findAllCharacters() {
        return  this.characterRepository.findAll();
    }

    public Character findByName(String name) {
        return  this.characterRepository.findbyName(name)
                .orElseThrow(() -> new UnknownCharacterNameException(name));
    }

}
