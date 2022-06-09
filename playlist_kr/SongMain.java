import java.util.List;
import java.util.function.Supplier;

/**
 * класс с точкой входа для проверки работы некоторых методов
 */
public class SongMain {
    public static void main(String[] args) {
        String fileName = "C:/Program Files/IdeaProjects/music_kr/songs.txt";
        WorkWithSongFile text = new WorkWithSongFile(fileName);
        WorkWithSongList songText = new WorkWithSongList(text.readTextFile());
//        System.out.println(Arrays.toString(songText.linesSongInformation(text.readTextFile())));

        Supplier<List<Song>> songs = new WorkWithSongList(text.readTextFile());
//2        System.out.println(songs.get());

        PlayList playlist = new PlayList("rock", "my favourite collection");
        FilterGenreSongPredicate rock = new FilterGenreSongPredicate("rock");
        System.out.println(playlist.makePlaylistGenre(songs, rock));
//        System.out.println(playlist);

        String path_to_file = "C:\\Program Files\\IdeaProjects\\music_kr\\my_playlist.txt";

        WorkWithDoneFile file = new WorkWithDoneFile(path_to_file, false);
        file.writeToResultFile(playlist, playlist.makePlaylistGenre(songs, rock), path_to_file, false);

    }
}
