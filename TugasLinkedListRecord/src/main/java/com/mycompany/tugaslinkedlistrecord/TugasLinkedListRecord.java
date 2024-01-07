package com.mycompany.tugaslinkedlistrecord;
import java.util.Scanner;
import java.util.LinkedList;

public class TugasLinkedListRecord {
    public record Person(String nama, int umur){}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah orang yang ingin dimasukkan: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine();
        
       LinkedList<Person> peopleList = new LinkedList<>();

        for (int i = 0; i < numPeople; i++) {
            System.out.print("Masukkan nama orang ke-" + (i + 1) + ": ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan umur orang ke-" + (i + 1) + ": ");
            int umur = scanner.nextInt();
            scanner.nextLine(); 

            Person person = new Person(nama, umur);
            peopleList.add(person);
        }

        System.out.println("People in the list:");
        for (Person person : peopleList) {
            System.out.println("Name: " + person.nama() + ", Age: " + person.umur());
        }

        scanner.close();
    }
}
