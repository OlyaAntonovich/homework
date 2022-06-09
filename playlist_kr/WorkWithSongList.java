package playlist_kr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static java.awt.SystemColor.text;

public class WorkWithSongList implements Supplier<List<Song>> {
    private String songText;
    private final String regexDelimeter;
    private final String regexDelimeter1;
    private final String regexDelimeter2;

    public WorkWithSongList(String songText) {
        this.songText = songText;
        this.regexDelimeter = "\n";
        this.regexDelimeter1 = " - ";
        this.regexDelimeter2 = ";";
    }

    /**
     * разбивка строки из файла на подстроки
     * @param text текстовая строка
     * @return массив строк
     */
    public String[] linesSongInformation(String text) {
        String[] lines = text.split(regexDelimeter);
        return lines;
    }

    /**
     * разбивка каждой строки на подстроки (характеристики песни)
     * @param line строка текстового файла
     * @return массив характеристик песни из строки
     */
    public String[] takeSongCharecteristicFromLine(String line) {
        String[] songCharecteristicFromLine = line.split(regexDelimeter1);
        return songCharecteristicFromLine;
    }

    /**
     * извлечение из характеристик песни жанров
     * @param genre жанры песни
     * @return список жанров песни
     */
    public List<String> takeGenreFromLine(String genre) {
        List<String> genres = new ArrayList<>();
        String[] subStr = genre.split(regexDelimeter2);
        for (int i = 0; i < subStr.length; i++) {
            genres.add(subStr[i]);
        }
        return genres;
    }

    /**
     * извлечение из характеристик песни настроений
     * @param mood настроения песни
     * @return список настроений песни
     */
    public List<String> takeMoodFromLine(String mood) {
        List<String> moods = new ArrayList<>();
        String[] subStr = mood.split(regexDelimeter2);
        for (int i = 0; i < subStr.length; i++) {
            moods.add(subStr[i]);
        }
        return moods;
    }

    /**
     * создание саплаера в виде списка песен из загружаемого источника
     * @return список песен с характеристиками
     */
    @Override
    public List<Song> get() {
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < linesSongInformation(songText).length; i++) {
            Song song = new Song();
            song.setNameSong(takeSongCharecteristicFromLine(linesSongInformation(songText)[i])[0]);
            song.setSingerSong(takeSongCharecteristicFromLine(linesSongInformation(songText)[i])[1]);
            song.setGenreSong(takeGenreFromLine(takeSongCharecteristicFromLine(linesSongInformation(songText)[i])[2]));
            song.setMoodSong(takeMoodFromLine(takeSongCharecteristicFromLine(linesSongInformation(songText)[i])[3]));
            song.setDurationSong(takeSongCharecteristicFromLine(linesSongInformation(songText)[i])[4]);
            songs.add(song);
        }

        return songs;
    }


}
