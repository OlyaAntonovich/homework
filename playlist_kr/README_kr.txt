1.пакет files содержит

songs.txt - список песен для обработки
my_playlist.txt - записанный в файл плейлист

2.пакет predicate:

класс FilterGenreSongPredicate содержит один метод test(Song song) -
проверяет, подходит ли песня под заданный жанр

класс FilterMoodSongPredicate содержит один метод test(Song song) -
проверяет, подходит ли песня под заданное настроение

3.класс Song - описание объекта "song" и его свойств

4.класс PlayList содержит методы:

makePlaylistALL(Supplier<List<Song>> songs) - добавляет все песени в плейлист
makePlaylistGenre(Supplier<List<Song>> songs, Predicate<Song> genre) - добавляет
песни, отобранные по жанру
makePlaylistMood(Supplier<List<Song>> songs, Predicate<Song> mood) - добавляет
песни, отобранные по настроению
makePlaylistAddOne(List<Song> songs, int item) - добавляет одну песню

5.класс WorkWithSongFile содержит один метод:

readTextFile() - метод чтения текста из файла

6.класс WorkWithSongList содержит методы:

linesSongInformation(String text) - разбивка строки из файла на подстроки
takeSongCharecteristicFromLine(String line) - разбивка каждой строки на подстроки (характеристики песни)
takeGenreFromLine(String genre) - извлечение из характеристик песни жанров
takeMoodFromLine(String mood) - извлечение из характеристик песни настроений
get() - создание саплаера в виде списка песен из загружаемого источника

7.класс WorkWithDoneFile содержит один метод:

writeToResultFile(PlayList playlist, List<Song> songs, String path_to_file, boolean append) -
метод записи описания плейлиста и самого плейлиста в файл

8.класс SongMain - точка входа, проверка работы некоторых методов
