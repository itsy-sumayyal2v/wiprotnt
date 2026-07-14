import java.io.*;
import java.util.Scanner;

public class count {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the character to be counted: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        FileReader fr = new FileReader(fileName);

        int data;
        int count = 0;

        while ((data = fr.read()) != -1) {
            char c = Character.toLowerCase((char) data);
            if (c == ch) {
                count++;
            }
        }

        fr.close();

        System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + ch + "'.");
    }
}