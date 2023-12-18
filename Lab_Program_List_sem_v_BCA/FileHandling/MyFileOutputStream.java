import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {

    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("D:\\My Database\\FileOutputStream.txt")) {
           String str = "My name is Rajkishor";
           byte b[] = str.getBytes();
           fout.write(b);
        System.out.println("Data is successfully written.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
