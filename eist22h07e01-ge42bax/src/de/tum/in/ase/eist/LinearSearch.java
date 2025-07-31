package de.tum.in.ase.eist;

import java.util.List;
import java.util.Objects;

public class LinearSearch implements SearchStrategy {

    public int performSearch(List<Chapter> book, String name) {

        for (int i = 0; i < book.size(); i++) {
            if (Objects.equals(name, book.get(i).getName())) {
                return book.get(i).getPageNumber();
            }

        }

        return -1;
    }
}
