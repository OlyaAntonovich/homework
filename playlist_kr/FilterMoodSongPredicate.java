import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMoodSongPredicate implements Predicate<Song> {

    private String mood;

    public FilterMoodSongPredicate(String mood) {

        this.mood = mood;
    }

    /**
     * метод проверяет, подходит ли песня под заданное настроение
     * @param song проверемая песня
     * @return отвечает, подходит ли песня под заданное условие или нет
     */
    @Override
    public boolean test(Song song) {
        return song.getMoodSong().contains(mood);
    }
}
