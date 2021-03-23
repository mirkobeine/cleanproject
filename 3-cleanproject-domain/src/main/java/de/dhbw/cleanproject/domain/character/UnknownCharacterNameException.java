package de.dhbw.cleanproject.domain.character;

public class UnknownCharacterNameException extends NullPointerException {

    public UnknownCharacterNameException(String name) {
        super(String.format("character with name [%s] not found", name));
    }
}
