package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HW_6 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println ("Введите любые 10 цифр от 0 до 9:");

        int x [] = new int [10]; // Создаём массив int размером в 10

        for (int i = 0; i < 10; i++) {
            x[i] = in.nextInt(); // Заполняем массив элементами
            if (x[i] > 10) {
                System.out.println("Прошу же до 10!"); //Проверка чисел на условие
                i--;
            }
        }
        //  }
        String final1=createPhoneNumber(x);

        System.out.println(final1);
    }

    public static String createPhoneNumber (int x []){
        String v = "(";
        for (int j = 0; j < 10; j++) {
            if (j==3){
                v=v+") ";}
            if (j==6) {
                v=v+"-";}
            v=v+Integer.toString(x[j]);
        }

        return v;
    }
}