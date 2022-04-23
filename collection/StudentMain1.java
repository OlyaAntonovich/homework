package collection;

import collection.comporator.SortAge;
import collection.comporator.SortMarks;
import collection.comporator.SortNames;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class StudentMain1 {
    public static void main(String[] args) throws IOException {
        List<Students> student = new ArrayList<>();
        Random random = new Random();
        String fileName = "C:/Program Files/IdeaProjects/JD/HomeWork/src/collection/NAME.txt";


        //Создаем 50 объектов класс Student и помещаем в коллекцию.
        // Данные заполняются рандомно.

        for (int i = 0; i <=500 ; i++) {

            Students stud = new Students();
            stud.setNumber(random.nextInt(15_000));
            stud.setName(randomName(readUsingScanner(fileName)));
            stud.setAge(7+(random.nextInt(10)));
            stud.setMark(0.0+(random.nextDouble()*10.0));
            stud.setOlimp(random.nextBoolean());
            student.add(stud);
        }

        System.out.println (Arrays.toString(student.toArray()));

        //Создаем новый список студентов, отфильтрованный по возрасту

        List<Students> student1;
        student1 = filterAge (student);
        System.out.println (Arrays.toString(student1.toArray()));

        //Создаем новый список студентов, отфильтрованный по ценкам

        List<Students> student2;
        student2 = filterMark (student);
        System.out.println (Arrays.toString(student2.toArray()));

        //Выводим средний возраст отфильтрованных студентов,
        // пользуясь методом middleAge(List<Students> student);

        System.out.println (middleAge(student1));

        //выводим топ-10 отфильтрованных студентов по имени, от меньшему к большему

        student1.sort (new SortNames());
        System.out.println(topTen (student1));

        //выводим топ-10 отфильтрованных студентов по оценке, от большего к меньшему

       student1.sort (new SortMarks());
       System.out.println(topTen (student2));

       //выводим топ-10 отфильтрованных студентов по возрасту и оценке одновременно
        List<Students> student3;
        student3 = sortMarkAge(student);
        System.out.println(topTen (student3));

    }

    /**
     * читает строки из внешнего файла и возвращает их в виде списка
     * @param fileName загруженный файл
     * @return список строк
     * @throws IOException
     */
    private static List <String> readUsingScanner(String fileName) throws IOException {
        List<String> masName = new ArrayList<>();

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

        while(scanner.hasNextLine()){
            masName.add(scanner.nextLine());
        }
        return masName;
    }

    /**
     * выбирает рандомное имя (строку) из списка имен (строк)
     * @param masName список строк (имен)
     * @return рандомное имя (строку)
     */
    private static String randomName (List <String> masName){
        Random random = new Random();
        return (masName.get(random.nextInt(masName.size())));

    }

    /**
     * фильтрует список по возрасту
     * @param student список, который нужно отфильтровать по параметру "возраст"
     * @return отфильтрованный по возрасту список
     */
    public static List <Students> filterAge (List<Students> student){
        List<Students> student1 = new ArrayList<>();
        int i = 0;

        do  {
            if ((student.get(i).getAge()>=12 && student.get(i).getAge()<=17)){

                student1.add(student.get(i));
            }
            i++;

        } while (i<student.size());

        return student1;
    }

    /**
     * создает список из 10-ти первых элементов входящего списка
     * @param student список, из которого нужно выбрать топ-10
     * @return топ-10 списка
     */
    public static List <Students> topTen (List<Students> student){
        List<Students> student1 = new ArrayList<>(10);
        for (int j = 0; j <11; j++) {
            student1.add(student.get(j));
        }
        return student1;

    }

    /**
     * фильтрует список по оценкам
     * @param student список, который нужно отфильтровать по параметру "оценка"
     * @return отфильтрованный по оценкам список
     */

    public static List <Students> filterMark(List<Students> student){
        List<Students> student1 = new ArrayList<>();
        int i = 0;

        do  {
            if ((student.get(i).getMark()>=8)){

                student1.add(student.get(i));
            }
            i++;

        } while (i<student.size());
        return student1;
    }

    /**
     * считает средний возраст студентов списка
     * @param student список студентов
     * @return средний возраст студентов
     */
    public static double middleAge (List<Students> student){
        double middleAge;
        int summ=0;

        for (int i = 0; i<student.size(); i++) {
            summ = summ+(student.get(i).getAge());

        }
        middleAge=(double)(summ/(student.size()));

        return middleAge;
    }

    /**
     * фильтрует список по двум параметрам оценка-возраст
     * @param student список, который нужно отфильтровать
     * @return отфильтрованный по оценкам и возрасту список
     */
    public static List <Students> sortMarkAge(List<Students> student){

        for (int i = 0; i < student.size(); i++) {
            student.sort (new SortAge());
            for (int j = 0; j < student.size(); j++) {
                student.sort (new SortMarks());
            }

        }
        return student;
    }


}
