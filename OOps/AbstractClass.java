/*
 *                  Abstract class
 *               -> Cannot create create an instance of abstract class
 *               -> Can have abstract/non-abstract methods
 *               -> Can have constructors
 */

public class AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();        
        System.out.println(h1.color);
    }
}

abstract class IsAnimal {
    String color;
    IsAnimal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends IsAnimal{
    void changeColor(){
        color="dark brown";
    }
    void walk (){
         System.out.println("Walks on 4 legs");
    }
}

class Chicken extends IsAnimal {
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

/*
 *  Output
 *  animal eats
 *  Walks on 4 legs
 *  animal eats
 *  Walks on 2 legs
 *  brown
 */