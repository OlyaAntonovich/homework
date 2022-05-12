package home_work_5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextRead {

    private String fileName;

    public TextRead() {
        this.fileName = fileName;
    }

    public String readTextFile(String fileName) {
        Path path = Paths.get(fileName);
        StringBuilder builder = new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
            }
        } catch (IOException ex) {

        }

        return builder.toString();
    }

}
