package home_work_5;

import home_work_5.search.ISearchEngine;
import home_work_5.search.RegExSearch;
import home_work_5.search.SearchEnginePunctuationNormalizer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithDirectory {
    private File file;

    public WorkWithDirectory(File file) {
        this.file = file;
    }

    /**
     * метод создает список всех файлов, содержащихся в директории
     *
     * @param file адрес, по которому пользователь запрашивает файлы
     * @return список всех файлов, содержащихся в директории
     */
    public List<String> containFiles(File file) {
        List<String> data = new ArrayList<>();
        if (file.isFile()) {
            data.add(file.getAbsolutePath());
        } else {
            File[] contentDirectory = file.listFiles();
            if (contentDirectory != null) {
                for (File files : contentDirectory) {
                    List<String> deepContent = containFiles(files);

                    data.addAll(deepContent);
                }
            }
        }
        return data;
    }

    /**
     * метод, который по кусочку слова из названия файла
     * возвращает полный адрес файла
     *
     * @param fileBooks список всех файлов, содержащихся в директории
     * @param fileName  вводимый пользователем кусок названия искомого  файла
     * @return полный адрес файла
     */
    public String returnRightFileName(List<String> fileBooks, String fileName) {

        for (int i = 0; i < fileBooks.size(); i++) {
            if (fileBooks.get(i).contains(fileName)) {
                fileName = fileBooks.get(i);
                break;
            }
        }
        return fileName;
    }

    /**
     * метод, который считает количество совпадений слова в тексте
     *
     * @param file адрес, по которому располагается файл с текстом
     * @param word искомое слово
     * @return количество совпадений слова в тексте
     */
    public long choosenMatches(String file, String word) {
        TextRead textFile = new TextRead(file);
        ISearchEngine text = new SearchEnginePunctuationNormalizer
                (new RegExSearch(file));

        long countSerchWord = text.search(textFile.readTextFile(), word);

        return countSerchWord;
    }

    /**
     * метод, который записывает результаты поиска пользователя в файл
     *
     * @param file файл, в котором пользователь ищет слова
     * @param word искомое слово
     */
    public void writeToResultFile(String file, String word) {
        String textToWrite = "Имя файла" + "  " + file + "  " + "\nискомое слово:" + "  " + word + "  " +
                "\nколичество повторений слова:" + "  " + choosenMatches(file, word);

        try (FileWriter writer = new FileWriter("C:\\Program Files\\IdeaProjects\\JD\\HomeWork" +
                "\\src\\home_work_5\\result.txt", true)) {

            writer.write(textToWrite);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * метод реализует алгоритм общения с пользователем
     *
     * @param fileBooks список файлов в директории
     */
    public void chooseWhatToDo(List<String> fileBooks) {

        boolean isChoose = false;

        do {
            System.out.println("Ведите имя файла с которым вы хотите работать:");
            Scanner scan1 = new Scanner(System.in);
            String fileName = scan1.nextLine();
            System.out.println("Ведите cлово, которое ищите:");
            String scanWord = scan1.nextLine();

            fileName = returnRightFileName(fileBooks, fileName);

            System.out.println(scanWord + "  " + choosenMatches(fileName, scanWord));
            writeToResultFile(fileName, scanWord);
            System.out.println("Вы хотите продолжить работу с файлами - выберите да или нет");
            String chooseAction = scan1.nextLine();
            if (chooseAction.equalsIgnoreCase("да")) {
                isChoose = true;
            } else {
                isChoose = false;
            }

        } while (isChoose);
    }

}
