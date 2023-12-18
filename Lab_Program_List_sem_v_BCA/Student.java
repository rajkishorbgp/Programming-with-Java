// BCA package
package BCA;

// Student class in the BCA package
public class Student {
    private String name;
    private int rollNumber;
    private int DBMS;
    private int java;
    private int computerNetworks;
    private int numericalMethod;

    // Parameterized constructor to accept student details
    public Student(String name, int rollNumber, int DBMS, int java, int computerNetworks, int numericalMethod) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.DBMS = DBMS;
        this.java = java;
        this.computerNetworks = computerNetworks;
        this.numericalMethod = numericalMethod;
    }

    // Display method to display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("DBMS: " + DBMS);
        System.out.println("java: " + java);
        System.out.println("computerNetworks: " + computerNetworks);
        System.out.println("numericalMethod: "+ numericalMethod);
    }

    public int getTotalMarks() {
        return DBMS + java + computerNetworks + numericalMethod;
    }

    public double getPercentage() {
        return (getTotalMarks() / 4.0); 
    }
}
