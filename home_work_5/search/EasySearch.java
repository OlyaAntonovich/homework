package home_work_5.search;

public class EasySearch implements ISearchEngine {

    private String text;

    public EasySearch(String text) {
        this.text = text;
    }

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
