package de.dhbw.cleanproject.application.character.command;

import org.apache.commons.lang3.Validate;

public class CreateCharacterCommand {

    private final String name;
    private final int level;
    private final int initiative;

    public CreateCharacterCommand(String name, int level, int initiative) {
        Validate.notBlank(name);

        this.name = name;
        this.level = level;
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getInitiative() {
        return initiative;
    }

    @Override
    public String toString() {
        return "CreateCharacterCommand{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", initiative=" + initiative +
                '}';
    }
}
