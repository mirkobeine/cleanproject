package de.dhbw.cleanproject.character;

public class CharacterResource {

    private String name;

    public CharacterResource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CharacterResource{" +
                "name='" + name + '\'' +
                '}';
    }
}
