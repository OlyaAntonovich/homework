package home_work_5.search;

import home_work_5.search.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    private final String text;

    public RegExSearch(String text) {
        this.text = text;
    }

    /**
     * метод возвращает информации о количестве раз, которое встречается слово в тексте
     * при помощи класса Matcher
     *
     * @param text текст для поиска
     * @param word искомое слово
     * @return количестве раз, которое встречается слово в тексте
     */
    @Override
    public long search(String text, String word) {
        long countSearchWords = 0;
        Pattern patternWord = Pattern.compile((word));
        Matcher matcherWord = patternWord.matcher(text);

        while (matcherWord.find())
            countSearchWords++;

        return countSearchWords;
    }
}
