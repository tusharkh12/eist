package de.tum.in.ase.eist.service;

import de.tum.in.ase.eist.model.Person;
import de.tum.in.ase.eist.util.PersonSortingOptions;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PersonService {
    // do not change this
    private final List<Person> persons;

    public PersonService() {
        this.persons = new ArrayList<>();
    }

    public Person savePerson(Person person) {
        var optionalPerson = persons.stream().filter(existingPerson -> existingPerson.getId().equals(person.getId())).findFirst();
        if (optionalPerson.isEmpty()) {
            person.setId(UUID.randomUUID());
            persons.add(person);
            return person;
        } else {
            var existingPerson = optionalPerson.get();
            existingPerson.setFirstName(person.getFirstName());
            existingPerson.setLastName(person.getLastName());
            existingPerson.setBirthday(person.getBirthday());
            return existingPerson;
        }
    }

    public void deletePerson(UUID personId) {
        this.persons.removeIf(person -> person.getId().equals(personId));
    }

    public List<Person> getAllPersons(PersonSortingOptions sortingOptions) {
        PersonSortingOptions.SortingOrder one = sortingOptions.getSortingOrder();
        PersonSortingOptions.SortField two = sortingOptions.getSortField();
        if (one == PersonSortingOptions.SortingOrder.ASCENDING) {
            if (two == PersonSortingOptions.SortField.ID) {
                return persons.stream().sorted(Comparator.comparing(Person::getId)).collect(Collectors.toList());

            } else if (two == PersonSortingOptions.SortField.BIRTHDAY) {
                return persons.stream().sorted(Comparator.comparing(Person::getBirthday)).collect(Collectors.toList());
            } else if (two == PersonSortingOptions.SortField.FIRST_NAME) {
                return persons.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
            } else {
                return persons.stream().sorted(Comparator.comparing(Person::getLastName)).collect(Collectors.toList());
            }


        } else {
              if (two == PersonSortingOptions.SortField.ID) {
                return persons.stream().sorted((o1, o2) -> o2.getId().compareTo(o1.getId())).collect(Collectors.toList());

            } else if (two == PersonSortingOptions.SortField.BIRTHDAY) {
                  return persons.stream().sorted((o1, o2) -> o2.getBirthday().compareTo(o1.getBirthday())).collect(Collectors.toList());

              } else if (two == PersonSortingOptions.SortField.FIRST_NAME) {
                  return persons.stream().sorted((o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName())).collect(Collectors.toList());

              } else {
                  return persons.stream().sorted((o1, o2) -> o2.getLastName().compareTo(o1.getLastName())).collect(Collectors.toList());

              }


        }
    }
}
