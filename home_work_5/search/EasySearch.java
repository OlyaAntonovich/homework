package home_work_5.search;

public class EasySearch implements ISearchEngine {

    private String text;

    public EasySearch(String text) {
        this.text = text;
    }

    /**
     * метод возвращает информации о количестве раз, которое встречается слово в тексте
     * поиск реализован с использованием метода indexOf из класса String
     *
     * @param text текст для поиска
     * @param word искомое слово
     * @return количестве раз, которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        long countSearchWords = 0;
        int searchWords = text.indexOf(word);
        int wordLength = 0;

        while (searchWords != -1) {
            countSearchWords++;
            searchWords = text.indexOf(word, searchWords + wordLength);
            wordLength = word.length();
        }
        return countSearchWords;
    }
}
