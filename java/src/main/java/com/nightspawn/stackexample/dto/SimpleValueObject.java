package com.nightspawn.stackexample.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * @see <a href=
 *      "http://www.openknowledge.de/publikationen/vortraege/ein-name-ist-ein-name-und-kein-string.html"
 *      >Jens Schumann / Jax 2012</a>
 */
public abstract class SimpleValueObject<W extends Comparable<W>> implements Serializable, Comparable<SimpleValueObject<W>> {

    private static final long serialVersionUID = -9050642604488092562L;

    /**
     * Any implementations of this method should return either instances of
     * final classes or copies of the wrapped type instance in order to maintain
     * immutability. Also this method can be used for JSR-303 bean validation if
     * annotated with the desired constraints
     * 
     * @return an instance of the wrapped type in a way that any changes to that
     *         instance don't affect the {@link SimpleValueObject} itself
     */
    protected abstract W value();

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        SimpleValueObject<?> other = SimpleValueObject.class.cast(o);
        return value().equals(other.value());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value());
    }

    @Override
    public String toString() {
        if (value() == null) {
            return "null";
        } else {
            return value().toString();
        }
    }

    @Override
    public int compareTo(SimpleValueObject<W> other) {
        if (other == null) {
            return 1;
        }
        return value().compareTo(other.value());
    }
}
