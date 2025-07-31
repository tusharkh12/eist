package de.tum.in.ase.eist;

import java.util.Objects;

public abstract class ClassTreeElement {

    private String name;

    protected ClassTreeElement(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public abstract int calculateClassCount();

    @Override
    public String toString() {
        return String.format("%s[%s]", getClass().getSimpleName(), name);
    }

}
