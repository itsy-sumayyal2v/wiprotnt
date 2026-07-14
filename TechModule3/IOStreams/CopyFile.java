import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);

        int data;

        while ((data = fr.read()) != -1) {
            fw.write(data);
        }

        fr.close();
        fw.close();

        System.out.println("File is copied.");
    }
}