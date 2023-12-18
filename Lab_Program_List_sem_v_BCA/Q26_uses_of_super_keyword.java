/*
                        @Program: 26
    Write a java program to illustrate all uses of super keyword.

 */

public class Q26_uses_of_super_keyword {
    public static void main(String[] args) {
        Child son = new Child("Table","Window","Plants");
        son.childProperty();
        son.fatherProperty();
        son.grandFatherProperty();
    }
}

class GrandFather{
    protected String property;

    GrandFather(String grFatProperty){
        this.property = grFatProperty;
    }
}

class Father extends GrandFather{
    protected String property;

    Father(String fatProperty, String grFatProperty){
        super(grFatProperty);
        this.property = fatProperty;
    }

    public void grandFatherProperty(){
        System.out.println(super.property);
    }
}

class Child extends Father{
   private String property;
   Child(String childProperty, String fatProperty, String grFatProperty ){
        super(fatProperty,grFatProperty);
        this.property = childProperty;
   }
    public void childProperty(){
        System.out.println(this.property);
    }
    public void fatherProperty(){
        System.out.println(super.property);
    }
}

/*

Output:
Table
Window
Plants
 */