import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterGenreSongPredicate implements Predicate<Song> {

    private String genre;

    public FilterGenreSongPredicate(String genre) {
        this.genre = genre;
    }

    /**
     * метод проверяет, подходит ли песня под заданный жанр
     * @param song проверемая песня
     * @return отвечает, подходит ли песня под заданное условие или нет
     */
    @Override
    public boolean test(Song song) {
        return song.getGenreSong().contains(genre);
    }
}
