package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("John", "Smith", 29);
        Person p2 = new Person("Jane", "Doe", 34);
        Person p3 = new Person("Michael", "Johnson", 45);
        Person p4 = new Person("Emily", "Brown", 27);
        Person p5 = new Person("David", "Williams", 31);
        Person p6 = new Person("Sarah", "Jones", 22);
        Person p7 = new Person("Daniel", "Garcia", 38);
        Person p8 = new Person("Laura", "Miller", 26);
        Person p9 = new Person("James", "Davis", 52);
        Person p10 = new Person("Emma", "Martinez", 30);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);
        people.add(p8);
        people.add(p9);
        people.add(p10);

        // Step 2: Prompt the user for a name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine();

        // Find matches
        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchingPeople.add(person);
            }
        }
        List<Person> matchingPerson = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName)
                || person.getLastName().equalsIgnoreCase(searchName)).forEach(name -> System.out.println(name));

        // Display matches
        if (matchingPeople.isEmpty()) {
            System.out.println("No matches found for the name: " + searchName);
        } else {
            System.out.println("Matching people:");
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
        }

        // Step 3: Calculate and display average age, oldest and youngest person
        if (!people.isEmpty()) {
            int totalAge = 0;
            int oldestAge = people.get(0).getAge();
            int youngestAge = people.get(0).getAge();

            for (Person person : people) {
                int age = person.getAge();
                totalAge += age;

                if (age > oldestAge) {
                    oldestAge = age;
                }
                if (age < youngestAge) {
                    youngestAge = age;
                }
            }

            double averageAge = (double) totalAge / people.size();
            System.out.printf("Average Age: %.2f%n", averageAge);
            System.out.println("Oldest Age: " + oldestAge);
            System.out.println("Youngest Age: " + youngestAge);
        }




    }
}
