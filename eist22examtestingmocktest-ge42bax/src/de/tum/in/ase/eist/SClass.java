package de.tum.in.ase.eist;

import java.util.Objects;

/**
 * A SClass represents a class that can't contain other classes
 */
public final class SClass extends ClassTreeElement {

    private String content;

    public SClass(String name, String content) {
        super(name);
        this.content = Objects.requireNonNull(content);
    }

    public SClass(String name) {
        this(name, "");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = Objects.requireNonNull(content);
    }

    @Override
    public int calculateClassCount() {
        return 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), content);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SClass)) {
            return false;
        }
        SClass other = (SClass) obj;
        return Objects.equals(getName(), other.getName()) && Objects.equals(content, other.content);
    }
}
