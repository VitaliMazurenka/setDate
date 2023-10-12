package ait.homework;

import java.text.ParseException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ParseException {
        List<Person> persons= List.of(
                new Person("John Woods", "13.05.1914"),
                new Person("Anna Black", "23.07.1918"),
                new Person("Jack Ma", "30.12.1921"),
                new Person("Will Buth", "05.03.1933")
        );
        List<Person> orderedPersons = persons.stream()
                .sorted().toList();
        System.out.println(orderedPersons);
    }
}
