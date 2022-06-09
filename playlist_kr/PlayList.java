import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PlayList {
    private String playlistName;
    private String playlistCharacteristic;
    private Supplier<List<Song>> songs;


    public PlayList(String playlistName, String playlistCharacteristic) {
        this.playlistName = playlistName;
        this.playlistCharacteristic = playlistCharacteristic;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public String getPlaylistCharacteristic() {
        return playlistCharacteristic;
    }

    /**
     * добавление всех песен в плейлист
     * @param songs список песен
     * @return плейлист, состоящий из всех песен
     */
    public List<Song> makePlaylistALL(Supplier<List<Song>> songs) {
        List<Song> songsPlaylist = new ArrayList<>();

        songsPlaylist.addAll(songs.get());

        return songsPlaylist;
    }

    /**
     * метод, при помощи которого в плейлист добавляются песни, отобранные по жанру
     * @param songs список всех песен
     * @param genre жанр, по которому отбираются песни
     * @return список, отсортированных по жанру песен
     */
    public List<Song> makePlaylistGenre(Supplier<List<Song>> songs, Predicate<Song> genre) {
        List<Song> playlistGenre = new ArrayList<>();

        for (Song song : songs.get()) {
            if (genre.test(song)) {
                playlistGenre.add(song);
            }
        }
        return playlistGenre;
    }

    /**
     * метод, при помощи которого в плейлист добавляются песни, отобранные по настроению
     * @param songs список всех песен
     * @param mood настроение, по которому отбираются песни
     * @return список, отсортированных по настроению песен
     */
    public List<Song> makePlaylistMood(Supplier<List<Song>> songs, Predicate<Song> mood) {
        List<Song> playlistMood = new ArrayList<>();

        for (Song song : songs.get()) {
            if (mood.test(song)) {
                playlistMood.add(song);
            }
        }
        return playlistMood;
    }

    /**
     * метод, с помощью которого в плейлист добавляется одна песня
     * @param songs список всех песен
     * @param item позиция выбранной песни
     * @return список с добавленной песней
     */
    public List<Song> makePlaylistAddOne(List<Song> songs, int item) {
        List<Song> playlistAddOne = new ArrayList<>();

        playlistAddOne.add(songs.get(item + 1));

        return playlistAddOne;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playlistName='" + playlistName + '\'' +
                ", playlistCharacteristic='" + playlistCharacteristic + '\'' +
                '}';
    }
}
