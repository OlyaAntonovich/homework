package playlist_kr;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WorkWithDoneFile {

    private String path_to_file;
    private boolean append = false;

    public WorkWithDoneFile(String path, boolean value) {
        this.path_to_file = path_to_file;
        this.append = append;
    }

    /**
     * метод записи описания плейлиста и самого плейлиста в файл
     * @param playlist плейлист, который необходимо записать в файл
     * @param songs список песен, которые нужно записать в файл
     * @param path_to_file путь к записываемому файлу
     * @param append значение true/false, определяющие перезаписывать файл или нет
     */
    public void writeToResultFile(PlayList playlist, List<Song> songs, String path_to_file, boolean append) {

        String textToWrite = "  ";


        try (FileWriter writer = new FileWriter(path_to_file, append)) {

            writer.write(playlist.getPlaylistName());
            writer.append('\n');
            writer.write(playlist.getPlaylistCharacteristic());
            writer.append('\n');
            for (int i = 0; i < songs.size(); i++) {
                textToWrite = "N" + (i + 1) + "." + " " + songs.get(i).getNameSong() + " " + "-" +
                        " " + songs.get(i).getSingerSong() + " " + songs.get(i).getDurationSong();
                writer.write(textToWrite + '\n');
            }
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
