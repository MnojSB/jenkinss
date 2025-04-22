package demo;
import java.util.Scanner;

class Student {
    // Attributes of the Student
    String name;
    int age;
    String rollNo;
    String course;

    // Constructor to initialize the student details
    public Student(String name, int age, String rollNo, String course) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();  // Consume the leftover newline
        
        System.out.print("Enter roll number: ");
        String rollNo = scanner.nextLine();
        
        System.out.print("Enter course: ");
        String course = scanner.nextLine();

        // Create a student object using the entered details
        Student student = new Student(name, age, rollNo, course);

        // Display the student details
        System.out.println("\nStudent Details:");
        student.displayDetails();

        // Close the scanner
        scanner.close();
    }
}
