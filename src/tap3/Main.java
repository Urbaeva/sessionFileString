package tap3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader("song.txt");
        Scanner scanner = new Scanner(fileReader);

        int i = 0;
        while (scanner.hasNextLine()) {
            if (i == 1){
                i = 0;
                scanner.nextLine();
                continue;
            }
            i++;
            stringBuilder.append(scanner.nextLine()).append('\n');
        }
        fileReader.close();

        System.out.println(stringBuilder);
    }
}
