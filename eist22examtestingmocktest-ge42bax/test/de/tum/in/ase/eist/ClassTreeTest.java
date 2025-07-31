package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ClassTreeTest {

    // TODO: Test whether the calculation of the amount of classes is correct as described in the problem statement
    @Test
    void testClassCount() {
    }

    // TODO: Test whether the calculation of the amount of classes fails if no root is available as described in the
    // problem statement
    @Test
    void testGetClassCountThrowsOnNull() {
        ClassTree classTree=new ClassTree(null);
        assertThrows(IllegalStateException.class , () -> {
            classTree.getClassCount();
        });
    }
}
