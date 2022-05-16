package home_work_5;


import home_work_5.search.EasySearch;
import home_work_5.search.ISearchEngine;
import home_work_5.search.RegExSearch;
import home_work_5.search.SearchEnginePunctuationNormalizer;

public class TextMain {
    public static void main(String[] args) {
        String fileName = "C:/Program Files/IdeaProjects/JD/HomeWork/src/home_work_5/Война и мир_книга.txt";
        TextRead text = new TextRead(fileName);
        TextCollection textUniqueWords = new TextCollection(text.readTextFile());
        EasySearch textEasySearch = new EasySearch(fileName);
        RegExSearch textRegExSearch = new RegExSearch(fileName);
        ISearchEngine textPunctuationNormalizer = new SearchEnginePunctuationNormalizer(textRegExSearch);


        System.out.println(textUniqueWords.countUniqueWords());
        System.out.println(textUniqueWords.countTopWords(textUniqueWords.collectAllKeyWords(), 20));
        System.out.println("_________________________________________");
        System.out.println(textEasySearch.search(text.readTextFile(), " и "));
        System.out.println(textRegExSearch.search(text.readTextFile(), " и "));
        System.out.println(textPunctuationNormalizer.search(text.readTextFile(), " и "));
        System.out.println("_________________________________________");
        System.out.println(textEasySearch.search(text.readTextFile(), "война"));
        System.out.println(textRegExSearch.search(text.readTextFile(), "война"));
        System.out.println(textPunctuationNormalizer.search(text.readTextFile(), "война"));
        System.out.println("_________________________________________");
        System.out.println(textEasySearch.search(text.readTextFile(), "мир"));
        System.out.println(textRegExSearch.search(text.readTextFile(), "мир"));
        System.out.println(textPunctuationNormalizer.search(text.readTextFile(), "мир"));
    }
}
