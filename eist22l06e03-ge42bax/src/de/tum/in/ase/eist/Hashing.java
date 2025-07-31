package de.tum.in.ase.eist;

public abstract class Hashing {
    private HashFunction implementation;

    public Hashing(HashFunction implementation) {
        this.implementation = implementation;
    }

    public HashFunction getImplementation() {
        return implementation;
    }

    public abstract String hashDocument(String hashData);

}
