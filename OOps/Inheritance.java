/*
 *         *  Tnheritance
 *        -> Inheritance is when properties & methods of base class are passed on to a derived class.
 * 
 *         Types of Inheritance
 *         -> Single Level Inheritance      [Base Class] --> [Derived Class]  
 *         -> Multi Level Inheritance       [Base Class] --> [Derived Class] --> [Derived Class]
 *         -> Hierarchial Inheritance       [Base class] --> [Derived class]  1 
 *                                                      `--> [Derived class]  2...
 * 
 */

public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

//Base class 
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}

//Derived Class
class Mammal extends Animal {   
    int legs;
}

//Derived Class
class Dog extends Mammal {
    String breed;
}

/*
 *   Output:
 *   eats
 *   4
 */