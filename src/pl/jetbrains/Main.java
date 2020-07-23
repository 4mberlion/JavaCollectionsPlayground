package pl.jetbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        CreateAndPrintAnOrderedSetOfObjects();

    }

    public static void CreateAndPrintAnOrderedSetOfObjects() {
        SortedSet<Person> personSortedByName = new TreeSet<>(Comparator.comparing(Person::getName));
        personSortedByName.add(new Person(1, "Oliver"));
        Collections.addAll(personSortedByName, new Person(2, "Harry"),
                new Person(3, "George"),
                new Person(4, "Noah"),
                new Person(5, "Oliver"));
        //personSortedByName.stream().forEachOrdered(System.out::println);
        personSortedByName.forEach(System.out::println);
    }
}
