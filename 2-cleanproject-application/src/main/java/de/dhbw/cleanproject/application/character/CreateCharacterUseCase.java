package de.dhbw.cleanproject.application.character;

import de.dhbw.cleanproject.application.character.command.CreateCharacterCommand;
import de.dhbw.cleanproject.domain.character.Character;
import de.dhbw.cleanproject.domain.character.CharacterRepository;
import de.dhbw.cleanproject.domain.character.Initiative;
import de.dhbw.cleanproject.domain.character.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCharacterUseCase {

    private CharacterRepository characterRepository;

    @Autowired
    public CreateCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    public void createCharacter(CreateCharacterCommand command) {

        Level lvl = new Level(command.getLevel());
        Initiative init = new Initiative(command.getInitiative());
        Character character = new Character(command.getName(), lvl, init);

        this.characterRepository.save(character);
    }

}
