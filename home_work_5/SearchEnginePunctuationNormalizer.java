package home_work_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer extends SearchEnginePunctuationNormalizerDecorator {

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        super(iSearchEngine);
    }

    @Override
    public long search(String text, String word) {
        String regexDelimeter = "([(':,!.;?*=><\"\n)])";
        String regexDelimeter1 = "(\\-{2})";
        String regexDelimeter2 = "(\\s{2,})";

        String text1 = text.replaceAll(regexDelimeter, " ");
        String text2 = text1.replaceAll(regexDelimeter1, " ");
        String text3 = text2.replaceAll(regexDelimeter2, " ");


        long countSearchWords = 0;
        Pattern patternWord = Pattern.compile((word));
        Matcher matcherWord = patternWord.matcher(text3);

        while (matcherWord.find())
            countSearchWords++;

        return countSearchWords;
    }
}
