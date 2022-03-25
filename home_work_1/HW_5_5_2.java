package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HW_5_5_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println ("Как тебя зовут?");

        String x = in.nextLine();
        String a = "Вася";
        String b = "вася";
        String c = "Анастасия";
        String d = "анастасия";

        if (Objects.equals(x, a)||Objects.equals(x, b)){
            System.out.println ("Привет!"+"\nЯ так долго тебя ждал");
        }
            else if (Objects.equals(x, c)||Objects.equals(x, d)){
            System.out.println ("Я так долго тебя ждал");}

            else {
            System.out.println ("Добрый день, а вы кто?");
        }

    }
}
