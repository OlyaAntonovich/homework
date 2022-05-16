package home_work_5.tests;

import home_work_5.search.EasySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EasySearchTest {

    @Test
    public void EasySearchTest() {
        String text = "привет, как дела!";
        String text1 = "привет,какдела!";
        String text2 = "как дела!. Что делаешь?";
        String text3 = "Привет-привет";
        String text4 = "Привет -привет";
        String text5 = "4-х";
        String text6 = "один и 1";
        String text7 = "полу-социал-демократы";

        EasySearch easySearch = new EasySearch(text);

        long count = easySearch.search(text, "дела");
        long count1 = easySearch.search(text1, "дела");
        long count2 = easySearch.search(text2, "дела");
        long count3 = easySearch.search(text3, "привет-привет");
        long count4 = easySearch.search(text4, "привет-привет");
        long count5 = easySearch.search(text5, "4-х");
        long count6 = easySearch.search(text6, "1");
        long count7 = easySearch.search(text7, "-");

        System.out.println(count);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);

        Assertions.assertEquals(1, count);
        Assertions.assertEquals(1, count1); //показывает, что метод EasySearch
        // не работает без дополнительных обработок строки
        Assertions.assertEquals(2, count2);
        Assertions.assertEquals(0, count3);
        Assertions.assertEquals(0, count4);
        Assertions.assertEquals(1, count5);
        Assertions.assertEquals(1, count6);
        Assertions.assertEquals(2, count7);

    }
}
