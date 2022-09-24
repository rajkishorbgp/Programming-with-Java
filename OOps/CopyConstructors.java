/*
 *       Create Copy Constructors
 */

public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new  Student();
        s1.name="RajKishor";
        s1.roll= 1302;
        s1.marks[0]=80;
        s1.marks[1]=90;
        s1.marks[2]=70;
        s1.college="MIT";
        Student s2 = new Student(s1);
        s1.marks[1]=100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        s1.name="raja";
        s1.roll=6095;

        System.out.println(s1.name);
        System.out.println(s2.roll);

    }
}


/**
 * Student
 */

class Student {
    int roll;
    String name;
    String college;
    int marks[] = new int[3];
    Student(){}
/*
    // Shallow Copy constructor
    Student(Student s1){
        this.marks= s1.marks;
        this.roll  =  s1.roll;
        this.name  =  s1.name;
        this.college= s1.college;
    }
*/
    // deep cpoy constructor
    Student(Student s1){
        this.roll  =  s1.roll;
        this.name  =  s1.name;
        this.college= s1.college;
        for (int i = 0; i < 3; i++) {
            this.marks[i]= s1.marks[i];
        }
    }
}

/*
 *   Output
 *   80
 *   90
 *   70
 *   raja
 *   1302
 * 
 */