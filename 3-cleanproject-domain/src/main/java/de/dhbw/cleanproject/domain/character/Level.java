package de.dhbw.cleanproject.domain.character;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public final class Level {

    @Column(name = "level")
    private final Integer value;

    protected Level() {
        //jpa necessity
        this.value = null;
    }

    public Level(Integer value) {
        Validate.isTrue(value >= 0);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Level increase(Integer inc) {
        return new Level(this.value + inc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Level level = (Level) o;

        return value != null ? value.equals(level.value) : level.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Level{" +
                "value=" + value +
                '}';
    }
}
