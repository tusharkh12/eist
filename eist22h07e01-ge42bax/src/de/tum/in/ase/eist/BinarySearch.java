package de.tum.in.ase.eist;

import java.util.List;
import java.util.Objects;

public class BinarySearch implements SearchStrategy {


    public int performSearch(List<Chapter> book, String name) {


        int first = 0;
        int last = book.size() - 1;
        int mid = first + (first + last) / 2;
        int compare = name.compareTo(book.get(mid).getName());

        while (!Objects.equals(name, book.get(mid).getName())) {

            if (first > last) {
                return -1;
            }

            if (compare > 0) {
                first = mid + 1;
            } else if (Objects.equals(book.get(mid).getName(), name)) {
                return book.get(mid).getPageNumber();

            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;

        }


        return -1;
    }
}

