package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 2.5));
        students.add(new Student(3, "Charlie", 1.8));
        students.add(new Student(4, "Diana", 3.9));
        students.add(new Student(5, "Eve", 2.1));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        students.removeIf(student -> student.getGpa() < 2.0);
        System.out.println("Students with GPA < 2.0 have been removed.");
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        
        Student highest = students.get(0);
        for (Student student : students) {
            if (student.getGpa() > highest.getGpa()) {
                highest = student;
            }
        }
        System.out.println("Student with highest GPA: " + highest);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student newStudent = new Student(6, "Frank", 3.5);
        if (students.size() >= 2) {
            students.add(2, newStudent);
            System.out.println("New student inserted at index 2: " + newStudent);
        } else {
            System.out.println("Cannot insert at index 2. List size is too small.");
        }
    }

    public void printStudents() {
        // TODO: Print using Iterator
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        
        System.out.println("All Students:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next());
        }
    }
}
