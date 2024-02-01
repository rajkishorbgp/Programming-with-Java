/*
                                            @Program: 31
    Write a package BCA which has one class Student. Accept student detail through parameterized constructor. 
    Write display() method to display details. Create a main class which will use package and calculate total marks and percentage.
*/
import BCA.Student;

public class Q31_create_BCA_package {
    public static void main(String[] args) {
        Student student = new Student("Raj Kishor", 6095, 80, 75, 90,79);

        student.display(); 

        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Percentage: " + student.getPercentage() + "%");
    }
}

/*
 *   Output:
 *   Student Details:
 *   Name: Raj Kishor
 *   Roll Number: 6095
 *   DBMS: 80
 *   java: 75
 *   computerNetworks: 90
 *   numericalMethod: 79
 *   Total Marks: 324
 *   Percentage: 81.0%
 */