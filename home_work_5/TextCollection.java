package home_work_5;

import home_work_5.comparators.MapElementsComparator;

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

    public String[] formatTextToWords(String text) {
        String text1 = text.replaceAll(regexDelimeter, " ");
        String text2 = text1.replaceAll(regexDelimeter1, " ");
        String[] subStr = text2.split(regexDelimeter2);
        return subStr;
    }

    public HashSet<String> collectUniqueWords() {
        String[] subStr = formatTextToWords(text);
        HashSet<String> myHashSet = new HashSet<>();

        for (int i = 0; i < subStr.length; i++) {
            myHashSet.add(subStr[i]);
        }
        return myHashSet;
    }

    public int countUniqueWords() {
        HashSet<String> myHashSet = collectUniqueWords();
        int uniqueWords = myHashSet.size();
        return uniqueWords;
    }

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

    public List<Map.Entry<String, Integer>> countTopWords(Map<String, Integer> mapWarPeace, int top) {
        List<Map.Entry<String, Integer>> mapSortedList = new ArrayList<>(mapWarPeace.entrySet());

        mapSortedList.sort(new MapElementsComparator());

        return mapSortedList.subList(0, top);
    }

}



