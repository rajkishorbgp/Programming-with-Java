
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class My_BufferWriter {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("D:/My Database/myBuffrtWriter.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 50; i++) {
            bw.write("this is my first program to write string to directaly file");
            bw.newLine();
        }
        bw.close();
    }
}
