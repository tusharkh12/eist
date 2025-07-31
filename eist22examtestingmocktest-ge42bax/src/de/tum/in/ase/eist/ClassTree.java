package de.tum.in.ase.eist;

import java.util.Objects;

public class ClassTree {

    private ClassTreeElement root;

    public ClassTree(ClassTreeElement root) {
        this.root = root;
    }

    public ClassTreeElement getRoot() {
        return root;
    }

    public void setRoot(ClassTreeElement root) {
        this.root = root;
    }

    public int getClassCount() {
        if (root == null) {
            throw new IllegalStateException();
        }
        return root.calculateClassCount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassTree)) {
            return false;
        }
        ClassTree other = (ClassTree) obj;
        return Objects.equals(root, other.root);
    }
}
