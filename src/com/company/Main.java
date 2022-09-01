package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String personName = scanner.nextLine();
        write(fileName, personName);
        try {
            read(fileName);
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    public static void write(String fileName, String name) throws IOException{
        FileWriter fileWriter = new FileWriter("text.txt");
        fileWriter.write("Hello, Good morning " + name + "!");
        fileWriter.close();
    }

    public static void read(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        Scanner scanner = new Scanner(fileName);
        scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
