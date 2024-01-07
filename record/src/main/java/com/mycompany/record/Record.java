package com.mycompany.record;
public class Record {

    public static void main(String[] args) {
        record Person(String name, int age) {}
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);

        System.out.println("Person 1: " + person1.name() + ", Age: " + person1.age());
        System.out.println("Person 2: " + person2.name() + ", Age: " + person2.age());

        // Perbandingan antara dua objek Record
        if (person1.equals(person2)) {
            System.out.println("Person 1 and Person 2 are the same.");
        } else {
            System.out.println("Person 1 and Person 2 are different.");
        }
    }
}
