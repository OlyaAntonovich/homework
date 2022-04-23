package collection;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NameFile {
    public static void main(String[] args)throws IOException {
        String fileName = "C:/Program Files/IdeaProjects/JD/HomeWork/src/collection/NAME.txt";
 //       System.out.println(readUsingScanner(fileName));
        System.out.println(randomName(readUsingScanner(fileName)));

            }

    private static List <String> readUsingScanner(String fileName) throws IOException {
        List<String> masName = new ArrayList<>();

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        while(scanner.hasNextLine()){
            masName.add(scanner.nextLine());
        }
        return masName;
    }

    private static String randomName (List <String> masName){
        Random random = new Random();
        return (masName.get(random.nextInt(masName.size())));

    }


}
