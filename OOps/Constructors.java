/*
 *               ________Constructors________
 * 
 *    * Contructor is a specal method which is invoked automatically 
 *      at the time of object creation.
 * 
 *     --> Contructors have the some name as class or structure.
 *     --> Contructors din't have a return type.
 *     --> Contructors are only called once, at Object Creation.
 *     --> Memory allocation happens when constructor is called. 
 */

/*
 * *  Types of Constructors
 *     --> Non-Parameterized
 *     --> Parameterized
 *     --> Copy constructor
 */

public class Constructors {
    public static void main(String[] args) {
        Student st = new Student(); // constructor is called

        Student1 st1 = new Student1(); // constructor is called

        Student1 st2 = new Student1("Raj kishor"); // constructor is called

        Student1 st3 = new Student1(1302); // constructor is called

        Student1 st4 = new Student1("rajkishorbgp", 6095); // constructor is called
        st4.marks[0] = 100;
        st4.marks[1] = 90;
        st4.marks[2] = 80;
        System.out.println(st2.name);

        System.out.println(st3.roll);

        System.out.println(st4.name + "    " + st4.roll);

        Student1 st5 = new Student1(st4); // Copy constructor
        System.out.println("Copy constructor of st4");
        System.out.println(st5.name + "   " + st5.roll);
        for (int i = 0; i < 3; i++) {
            System.out.println(st5.marks[i]); // print st5 student marks
        }
        System.out.println(" Change of maeks st4 & name");
        st4.marks[1] = 50; // Change st4 marks
        st4.marks[2] = 50;
        st4.name = "Rajkishor";

        for (int i = 0; i < 3; i++) {
            System.out.println(st5.marks[i]); // print st5 student marks
        }
        System.out.println(st5.name);
    }
}

/**
 * Student
 */

class Student {

    String name;
    int roll;

    // Student(){
    // * automatically create
    // }

}

/**
 * Student1
 */

class Student1 {

    String name;
    int roll;
    int marks[];

    /*
     * 1 Constructor
     */
    Student1() { // Non-Parameterized
        System.out.println("Constructors is create...");
        marks = new int[3];
    }

    /*
     * 2 Constructor
     */
    Student1(String name) { // Parameterized
        this.name = name;
        marks = new int[3];
    }

    /*
     * 3 Constructor
     */
    Student1(int roll) { // Parameterized
        marks = new int[3];
        this.roll = roll;
    }

    /*
     * 4 Constructor
     */
    Student1(String name, int roll) { // Parameterized
        marks = new int[3];
        this.name = name;
        this.roll = roll;

    }

    /*
     * 5 Constructor
     */
    Student1(Student1 st) { // Copy constructor
        marks = new int[3];
        this.name = st.name;
        this.roll = st.roll;
        this.marks = st.marks;
    }
}








/*

______Output:_______________________________ 
     
     Constructors is create...
     Raj kishor
     1302
     rajkishorbgp    6095
     Copy constructor of st4
     rajkishorbgp   6095
     100
     90
     80
      Change of maeks st4 & name
     100
     50
     50
     rajkishorbgp
    

 */