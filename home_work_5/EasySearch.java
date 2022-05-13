package home_work_5;

public class EasySearch implements ISearchEngine {

    private String text;

    public EasySearch(String text) {
        this.text = text;
    }

    @Override
    public long search(String text, String word) {
        long countSearchWords = 0;
        int searchWords = text.indexOf(word);

        while (searchWords != -1) {
            countSearchWords++;
            searchWords = text.indexOf(word, searchWords + 1);
        }
        return countSearchWords;
    }
}
