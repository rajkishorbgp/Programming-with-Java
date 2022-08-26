
/*
 *            Object Oriented Programming
 */

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blur");
        p1.setTip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }

}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}