/*
                        @Program: 25
	Write a java program to illustrate the multilevel inheritance.

*/

public class Q25_illustrate_the_multilevel_inheritance {
    public static void main(String[] args) {
        Child son = new Child();
        son.grandFatherProperty();
        son.fatherProperty();
        son.childProperty();
    }
}
class GrandFather{
    public void grandFatherProperty(){
        System.out.println("Plants");
    }
}
class Father extends GrandFather{
    public void fatherProperty(){
        System.out.println("Window");
    }
}
class Child extends Father{
    public void childProperty(){
        System.out.println("Table");
    }
}

/*

Output:
Plants
Window
Table

 */