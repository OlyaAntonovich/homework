package home_work_5;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.lang.System.in;

public class TextRead {

    private String fileName;

    public TextRead(String fileName) {
        this.fileName = fileName;
    }

    /** метод помогает прочитать текстовый файл
     и конвертировать текст из данного текстового файла в строку
     * @return текстовую строку для дальнейшей работы с ней
     */
    public String readTextFile() {
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
