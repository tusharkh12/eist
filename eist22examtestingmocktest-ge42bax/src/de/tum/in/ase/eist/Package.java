package de.tum.in.ase.eist;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Package extends ClassTreeElement {

    private Set<ClassTreeElement> children;

    public Package(String name, Set<ClassTreeElement> children) {
        super(name);
        this.children = Objects.requireNonNull(children);
    }

    public Package(String name, ClassTreeElement... children) {
        super(name);
        this.children = new HashSet<>(Arrays.asList(children));
    }

    public Package(String name) {
        this(name, new HashSet<>());
    }

    public Set<ClassTreeElement> getChildren() {
        return children;
    }

    public void setChildren(Set<ClassTreeElement> children) {
        this.children = Objects.requireNonNull(children);
    }

    @Override
    public int calculateClassCount() {
        return children.stream().mapToInt(ClassTreeElement::calculateClassCount).sum();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), children);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package other = (Package) obj;
        return Objects.equals(getName(), other.getName()) && Objects.equals(children, other.children);
    }
}
