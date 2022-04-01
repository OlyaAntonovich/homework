package home_work_2.arrays;


import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArraysUtils {


    /**
     * Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.
     * @return массив чисел
     */

    public static int  [] arrayFromConsole(){

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер создаваемого массива:");

        int n = in.nextInt();

        int [] array = new int[n];

        System.out.println("Заполните создаваемый массив цифрами:");

        int i=0;

        for(i=0;i<array.length; i++) {
            array [i] = in.nextInt();
        }
            System.out.println ("Массив из " + i +" элементов сформирован:");


        return array;

    }

    /**
     * Данный метод принимает два аргумента и рандомным путем создает массив чисел
     * @param size указывает размер массива который мы хотим получить.
     * @param maxValueExclusion указывает до какого числа генерировать рандомные числа.
     * @return массив чисел
     */


    public static int [] arrayRandom(int size, int maxValueExclusion) {

        Scanner in = new Scanner(System.in);

        System.out.println("\nВведите размер создаваемого массива:");

        size = in.nextInt();

        System.out.println("Введите число, до какого будут перебираться элементы создаваемого массива:");

        maxValueExclusion = in.nextInt();

        int [] container = new int[size];

        Random r = new Random();
        String v = " ";

        for(int i=0;i<container.length; i++) {

           int x = r.nextInt (maxValueExclusion);
            container [i] = x;
            if (i==0){v =Integer.toString (x);
            } else {v = v + "," + Integer.toString (x);}

        }
        System.out.print("{"+ v + "}"+"\n");

        return container;



    }

}
