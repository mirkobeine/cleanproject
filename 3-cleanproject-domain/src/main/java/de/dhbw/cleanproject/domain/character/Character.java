package de.dhbw.cleanproject.domain.character;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;

@Entity
@Table(name = "character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_character_id")
    @SequenceGenerator(name = "seq_character_id", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Embedded
    private Level level;

    @Embedded
    private Initiative initiative;

    protected Character() {
        //jpa
    }

    public Character(String name, Level level, Initiative initiative) {
        Validate.notBlank(name);
        Validate.notNull(level);
        Validate.notNull(initiative);

        this.name = name;
        this.level = level;
        this.initiative = initiative;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public Initiative getInitiative() {
        return initiative;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", initiative=" + initiative +
                '}';
    }
}
