package home_work_5;


public class TextMain {
    public static void main(String[] args) {
        String fileName = "C:/Program Files/IdeaProjects/JD/HomeWork/src/home_work_5/Война и мир_книга.txt";
        TextRead text = new TextRead();
        TextCollection text1 = new TextCollection();

        System.out.println(text1.countUniqueWords(text1.collectUniqueWords
                (text1.formatTextToWords(text.readTextFile(fileName)))));
        System.out.println(text1.countTopWords((text1.collectAllKeyWords
                ((text1.formatTextToWords(text.readTextFile(fileName))))), 20));
    }
}
