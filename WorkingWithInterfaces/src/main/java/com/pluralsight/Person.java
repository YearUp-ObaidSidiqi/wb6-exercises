package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {

        firstName.compareTo(o.firstName);
        lastName.compareTo(o.lastName);
        return Integer.compare(this.age, o.age);
    }

    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }


    /// Explanation ?
  /*  @Override
    public int compareTo(Person o) {
        int firstNameComparison = firstName.compareTo(o.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        int lastNameComparison = lastName.compareTo(o.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        return Integer.compare(this.age, o.age);
    }*/

}
