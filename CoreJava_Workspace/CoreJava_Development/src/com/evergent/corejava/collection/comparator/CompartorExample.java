package com.evergent.corejava.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompartorExample {
    public static void main(String[] args) {
        // Creating a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramu", 22));
        students.add(new Student("Balu", 20));
        students.add(new Student("Surya", 23));
        students.add(new Student("Mahesh", 18));

        // Display the Before Sorting list
        System.out.println("Berfore Sort  List:");
        for (Student student : students) {
            System.out.println(student);
        }
 
        // Sort students by age using AgeComparator
        Collections.sort(students, new AgeComparator());

        // Display the sorted list by age
        System.out.println("\nSorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort students by name using NameComparator
       
        }
    }


