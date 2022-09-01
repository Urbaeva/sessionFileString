package tap2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name, word and count of iterations: ");
        String fileName = scanner.nextLine();
        String word = scanner.nextLine();
        int n = scanner.nextInt();

        write(fileName, word, n);
        read(fileName);
    }


    public static void write(String fileName, String word, int n) throws IOException {
        FileWriter fileWriter = new FileWriter("text.txt");
        for (int i = 0; i < n; i++) {
            fileWriter.write(word + '\n');
        }
        fileWriter.close();
    }

    public static void read(String fileName) throws IOException{
        FileReader fileReader = new FileReader("text.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
