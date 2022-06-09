package playlist_kr;

import java.util.List;

/**
 * класс песни
 */
public class Song {
    private String singerSong;
    private String nameSong;
    private List<String> genreSong;
    private List<String> moodSong;
    private String durationSong;

    public Song() {
        this.nameSong = nameSong;
        this.singerSong = singerSong;
        this.genreSong = genreSong;
        this.moodSong = moodSong;
        this.durationSong = durationSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public void setSingerSong(String singerSong) {
        this.singerSong = singerSong;
    }

    public void setGenreSong(List<String> genreSong) {
        this.genreSong = genreSong;
    }

    public void setMoodSong(List<String> moodSong) {
        this.moodSong = moodSong;
    }

    public void setDurationSong(String durationSong) {
        this.durationSong = durationSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public String getSingerSong() {
        return singerSong;
    }

    public List<String> getGenreSong() {
        return genreSong;
    }

    public List<String> getMoodSong() {
        return moodSong;
    }

    public String getDurationSong() {
        return durationSong;
    }

    @Override
    public String toString() {
        return
                " \n " + "nameSong='" + nameSong + '\'' +
                        ", singerSong='" + singerSong + '\'' +
                        ", genreSong=" + genreSong +
                        ", moodSong=" + moodSong +
                        ", durationSong='" + durationSong + '\'';
    }
}
