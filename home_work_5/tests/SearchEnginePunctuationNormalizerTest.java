package home_work_5.tests;

import home_work_5.search.ISearchEngine;
import home_work_5.search.RegExSearch;
import home_work_5.search.SearchEnginePunctuationNormalizer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchEnginePunctuationNormalizerTest {

    @Test
    public void SearchEnginePunctuationNormalizerTest() {
        String text = "привет, как дела!";
        String text1 = "привет,какдела!";
        String text2 = "как дела!. Что делаешь?";
        String text3 = "Привет-привет";
        String text4 = "Привет -!привет!";
        String text5 = "4-х";
        String text6 = "один и 1";
        String text7 = "полу-социал-демократы";
        String text8 = "мыл мылом мыльню";


        RegExSearch regExSearch = new RegExSearch(text);
        ISearchEngine textPunctuationNormalizer = new SearchEnginePunctuationNormalizer(regExSearch);

        long count = textPunctuationNormalizer.search(text, "дела");
        long count1 = textPunctuationNormalizer.search(text1, "какдела");
        long count2 = textPunctuationNormalizer.search(text2, "дела");
        long count3 = textPunctuationNormalizer.search(text3, "привет-привет");
        long count4 = textPunctuationNormalizer.search(text4, "привет-привет");
        long count5 = textPunctuationNormalizer.search(text5, "4-х");
        long count6 = textPunctuationNormalizer.search(text6, "1");
        long count7 = textPunctuationNormalizer.search(text7, "-");
        long count8 = textPunctuationNormalizer.search(text8, "мыл ");

        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);

        Assertions.assertEquals(1, count);
        Assertions.assertEquals(1, count1);
        Assertions.assertEquals(2, count2);
        Assertions.assertEquals(0, count3);
        Assertions.assertEquals(0, count4);
        Assertions.assertEquals(1, count5);
        Assertions.assertEquals(1, count6);
        Assertions.assertEquals(2, count7);
        Assertions.assertEquals(1, count8);

    }
}
