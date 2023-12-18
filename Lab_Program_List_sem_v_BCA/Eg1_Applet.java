import java.awt.*;
public class Eg1_Applet {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(600,500);
        f.setVisible(true);
        Button b = new Button("Submit");
        b.setSize(30,30);
        f.add(b);
    }
}