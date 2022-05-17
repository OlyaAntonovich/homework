package home_work_5;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ChooseBookMain {
    public static void main(String[] args) {
//        String filePath1 = "C:/Program Files/IdeaProjects/100_books";
        System.out.println("Ведите адрес папки, с которой вы хотите работать:");
        String scan = new Scanner(System.in).nextLine();
        File filePath = new File(String.valueOf(scan));
        WorkWithDirectory fileDirectory = new WorkWithDirectory(filePath);

        List<String> fileBooks = fileDirectory.containFiles(filePath);
        for (String fileBook : fileBooks) {
            System.out.println(fileBook);
        }

        fileDirectory.chooseWhatToDo(fileBooks);

    }
}
