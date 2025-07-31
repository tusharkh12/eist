package de.tum.in.ase.eist;

public interface DataServer {

    /**
     * Creates the given class tree element on the server with a given parent
     * @param classTreeElement the class tree element to create
     * @param parent the class tree element under which the new one should be created, null the root gets created
     * @return true if the operation was successful, false otherwise
     */
    boolean create(ClassTreeElement classTreeElement, ClassTreeElement parent);

}
