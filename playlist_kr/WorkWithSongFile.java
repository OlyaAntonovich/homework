import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WorkWithSongFile {
    private String fileNameSong;

    public WorkWithSongFile(String fileNameSong) {
        this.fileNameSong = fileNameSong;
    }

    /**
     * метод чтения текста из файла
     * @return текст из файла в виде строки
     */
    public String readTextFile() {
        Path path = Paths.get(fileNameSong);
        StringBuilder builder = new StringBuilder();

        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNextLine()) {
                builder.append(scanner.nextLine());
                builder.append("\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Все пошло не по плану. Начинаем сначала");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "WorkWithSongList{" + "fileNameSong='" + fileNameSong + '\'' + '}';
    }
}
