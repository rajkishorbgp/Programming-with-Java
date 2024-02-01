/*
 *                                Program: 32
 *   Write a java program to read the data from the file and copy it on another file.
 */

import java.io.*;
public class Q32_file_copy_it_on_another_file {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("./myFavouriteSong.txt");
        FileWriter fw = new FileWriter("./mydata.txt");
        BufferedReader bf = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String str;
        while ((str = bf.readLine()) != null) {
            System.out.println(str);
            bw.write(str);
            bw.newLine();
        }
        bf.close();
        bw.close();
        System.out.println("\nData successfully copied.");
    
    }
}

/*
    Output:
Jaagi Hoon Na Soyi Hoon
Khayalon Mein Tere Khoyi Hoon
Jaagi Hoon Na Soyi Hoon
Khayalon Mein Tere Khoyi Hoon

Izhaar Hua Humein Bhi Pyar Hua
Mulakaat Ki Hai Ghadi Ab
Aayi Aayi Aayi Aayi

Neend Mein Bhi
Labon Pe Naam Tera
Banke Main Rahun
Teri Parchhai Aayi Aayi Aayi

Tujhe Mere Liye
Mujhe Tere Liye
Hai Banaya Gaya
Oh Harjai Aayi Aayi Aayi

Data successfully copied.

 */