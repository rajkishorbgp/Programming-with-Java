import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class My_FileInputStream {
    public static void main(String[] args)throws IOException {
        int i;
            FileInputStream fout = new FileInputStream("D:/My Database/FileOutputStream.txt");
            do {
                i=fout.read();
                if (i!=-1) {
                    System.out.print((char)i);
                }
            } while (i!=-1);
        }
    }


// import java.io.FileInputStream;
// import java.io.IOException;

// public class My_FileInputStream {
//     public static void main(String[] args) {
//         try (FileInputStream fin = new FileInputStream("D:\\My Database\\FileOutputStream.txt")) {
//             int i;
//             while ((i = fin.read()) != -1) {
//                 System.out.print((char) i);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
