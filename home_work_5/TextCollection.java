package home_work_5;

import home_work_5.comparators.MapElementsComparator;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class TextCollection {

    private String text;
    private final String regexDelimeter;
    private final String regexDelimeter1;
    private final String regexDelimeter2;


    public TextCollection(String text) {
        this.text = text;
        this.regexDelimeter = "([(':,!.;?*=><\"\n)])";
        this.regexDelimeter1 = "(\\-{2})";
        this.regexDelimeter2 = "(\\s+)";
    }

    /**
     * метод форматирует строку и разбивает ее на слова, помещая в массив
     *
     * @param text передаваемая строка для форматирования
     * @return массив слов, из которых состояла переданная строка
     */
    public String[] formatTextToWords(@NotNull String text) {
        String text1 = text.replaceAll(regexDelimeter, " ");
        String text2 = text1.replaceAll(regexDelimeter1, " ");
        String[] subStr = text2.split(regexDelimeter2);
        return subStr;
    }

    /**
     * метод, благодаря которому мы получим коллекцию, содержащую набор слов,
     * который был использован при написании текста
     *
     * @return набор слов, который был использован при написании текста
     */
    public HashSet<String> collectUniqueWords() {
        String[] subStr = formatTextToWords(text);
        HashSet<String> myHashSet = new HashSet<>();

        for (int i = 0; i < subStr.length; i++) {
            myHashSet.add(subStr[i]);
        }
        return myHashSet;
    }

    /**
     * метод, который подсчитывает количество уникальных слов в тексте
     *
     * @return количество уникальных слов в тексте
     */
    public int countUniqueWords() {
        HashSet<String> myHashSet = collectUniqueWords();
        int uniqueWords = myHashSet.size();
        return uniqueWords;
    }

    /**
     * каждое полученное слово отформатированной строки помещает
     * как ключ в Map, а количество повторений в тексте ставит как значение
     *
     * @return коллекцию Map
     */
    public Map<String, Integer> collectAllKeyWords() {
        String[] subStr = formatTextToWords(text);
        Map<String, Integer> mapWarPeace = new HashMap<>();

        for (int i = 0; i < subStr.length; i++) {
            if (mapWarPeace.containsKey(subStr[i])) {
                int count = mapWarPeace.get(subStr[i]);
                mapWarPeace.put(subStr[i], ++count);
            } else {
                mapWarPeace.put(subStr[i], 1);
            }
        }
        return mapWarPeace;
    }

    /**
     * сортирует коллекцию Map и выводит заданное количество (top) слов и их повторений
     *
     * @param mapWarPeace коллекция Map
     * @param top         заданное количество (top) слов
     * @return выводит заданное количество (top) слов и их повторений
     */
    public List<Map.Entry<String, Integer>> countTopWords(@NotNull Map<String, Integer> mapWarPeace, int top) {
        List<Map.Entry<String, Integer>> mapSortedList = new ArrayList<>(mapWarPeace.entrySet());

        mapSortedList.sort(new MapElementsComparator());

        return mapSortedList.subList(0, top);
    }

}



