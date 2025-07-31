package de.tum.in.ase.eist;

import java.util.Optional;

public class DataManager {

    private DataServer dataServer;

    public DataServer getDataServer() {
        return dataServer;
    }

    public void setDataServer(DataServer dataServer) {
        this.dataServer = dataServer;
    }

    /**
     * Create a class or package by its path from the given class tree.
     *
     * @param classTree        the class tree to search through.
     * @param classTreeElement the new class tree element that should be created
     * @param path             the path in the file tree that the new element should be created at as array of class
     *                         tree element names
     * @return true if an element was found for the given path and successfully
     * created both on the data server and in the class tree, false otherwise
     */
    public boolean createAtPath(ClassTree classTree, ClassTreeElement classTreeElement, String... path) {
        if (classTreeElement == null) {
            throw new IllegalArgumentException();
        }
        ClassTreeElement root = classTree.getRoot();
        //Trying to create a root element but there is already one existent
        if (root != null && path.length == 0) {
            return false;
        } else if (root == null) {
            boolean createdOnServer = dataServer.create(classTreeElement, null);
            if (createdOnServer) {
                classTree.setRoot(classTreeElement);
            }
            return createdOnServer;
        }

        return createAtPath(classTreeElement, root, path, 1);
    }

    /**
     * Create a class tree element based on a path relative to the given parent.
     *
     * @param newElement the new element to creat
     * @param parent     the element at <code>path[index - 1]</code>
     * @param path       the path in the class tree that the new element should be created at as array of
     *                   names
     * @param index      <code>path[index]</code> is the next name to search for. If
     *                   this is the last element in the path array, we try to create at this position. Otherwise, we
     *                   walk
     *                   recursively deeper into the class tree.
     * @return true if an element was found for the given path and successfully created the element on the data
     * server, false otherwise
     */
    private boolean createAtPath(ClassTreeElement newElement, ClassTreeElement parent, String[] path, int index) {
        if (parent instanceof SClass) {
            return false;
        }
        Package package_ = (Package) parent;
        String targetName = path[index];
        // Search in the package_ for an element with the target name
        ClassTreeElement foundElement = package_.getChildren().stream()
                .filter(element -> element.getName().equals(targetName)).findFirst().orElse(null);
        // If no element with the target name was found, we cannot create in it
        if (foundElement == null) {
            return false;
        }
        // If the path does not end here, descend further
        int remaining = path.length - index;
        if (remaining > 1) {
            return createAtPath(newElement, foundElement, path, index + 1);
        }
        // Check if foundElementIsClass
        if (foundElement instanceof SClass) {
            return false;
        }
        Package foundPackage = (Package) foundElement;
        // Otherwise check if the name of the newElement does already exist for the same element type
        Optional<ClassTreeElement> optional = foundPackage.getChildren().stream()
                .filter(element -> element.getName().equals(newElement.getName()) && element.getClass()
                        .equals(newElement.getClass())).findAny();
        if (optional.isPresent()) {
            return false;
        }
        boolean createdOnServer = dataServer.create(foundElement, foundPackage);
        if (createdOnServer) {
            foundPackage.getChildren().add(newElement);
        }
        return createdOnServer;
    }
}
