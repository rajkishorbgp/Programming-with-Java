/*
                            @Program: 27
        Write a java program to demonstrate the runtime polymorphism.
 */

public class Q27_runtime_polymorphism {
    public static void main(String[] args) {
        Child son = new Child();
        son.property();
        Father father = new Father();
        father.property();
    }
}
class Father{
    public void property(){
        System.out.println("Window");
    }
}
class Child extends Father{
    public void property(){
        System.out.println("Table");
    }
}

/*

Output:
Table
Window

 */