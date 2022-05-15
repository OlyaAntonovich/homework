package home_work_5;


public class TextMain {
    public static void main(String[] args) {
        String fileName = "C:/Program Files/IdeaProjects/JD/HomeWork/src/home_work_5/Война и мир_книга.txt";
        TextRead text = new TextRead(fileName);
        TextCollection text1 = new TextCollection(text.readTextFile());
        EasySearch text2 = new EasySearch(fileName);
        RegExSearch text3 = new RegExSearch(fileName);
        ISearchEngine text4 = new SearchEnginePunctuationNormalizer(text3);


        System.out.println(text1.countUniqueWords());
        System.out.println(text1.countTopWords(text1.collectAllKeyWords(), 20));
        System.out.println("_________________________________________");
        System.out.println(text2.search(text.readTextFile(), " и "));
        System.out.println(text3.search(text.readTextFile(), " и "));
        System.out.println(text4.search(text.readTextFile(), " и "));
        System.out.println("_________________________________________");
        System.out.println(text2.search(text.readTextFile(), "война"));
        System.out.println(text3.search(text.readTextFile(), "война"));
        System.out.println(text4.search(text.readTextFile(), "война"));
        System.out.println("_________________________________________");
        System.out.println(text2.search(text.readTextFile(), "мир"));
        System.out.println(text3.search(text.readTextFile(), "мир"));
        System.out.println(text4.search(text.readTextFile(), "мир"));
    }
}
