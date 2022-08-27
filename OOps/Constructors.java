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

public class Constructors {
    public static void main(String[] args) {
        Student st = new Student(); // constructor is called

        Student1 st1 = new Student1(); // constructor is called

        Student1 st2 = new Student1("Raj kishor"); // constructor is called

        Student1 st3 = new Student1(1302); // constructor is called

        Student1 st4 = new Student1("rajkishorbgp", 6095); // constructor is called

        System.out.println(st2.name);

        System.out.println(st3.roll);

        System.out.println(st4.name + "    " + st4.roll);

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

    /*
     * 1 Constructor
     */
    Student1() {
        System.out.println("Constructors is create...");

    }

    /*
     * 2 Constructor
     */
    Student1(String name) {
        this.name = name;
    }

    /*
     * 3 Constructor
     */
    Student1(int roll) {
        this.roll = roll;
    }

    /*
     * 4 Constructor
     */
    Student1(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}