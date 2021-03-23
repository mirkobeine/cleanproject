package de.dhbw.cleanproject.domain.character;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public final class Initiative {

    @Column(name = "initiative")
    private final Integer value;

    protected Initiative() {
        //jpa necessity
        this.value = null;
    }

    public Initiative(Integer value) {
        Validate.isTrue(value >= 0);
        Validate.isTrue(value <= 99);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public Initiative increase(Integer inc) {
        return new Initiative(this.value + inc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Initiative level = (Initiative) o;

        return value != null ? value.equals(level.value) : level.value == null;
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Initiative{" +
                "value=" + value +
                '}';
    }
}
