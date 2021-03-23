package de.dhbw.cleanproject.character;

import de.dhbw.cleanproject.domain.character.Character;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CharacterToCharacterResourceMapper implements Function<Character, CharacterResource> {

    @Override
    public CharacterResource apply(Character character) {
        return map(character);
    }

    private CharacterResource map(Character character) {
        return new CharacterResource(character.getName());
    }
}
