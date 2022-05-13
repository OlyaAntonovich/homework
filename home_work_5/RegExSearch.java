package home_work_5;

import home_work_5.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    private String text;

    public RegExSearch(String text) {
        this.text = text;
    }

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
