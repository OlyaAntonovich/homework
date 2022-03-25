package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HW_5_5_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println ("Как тебя зовут?");

        String x = in.nextLine();

        switch (x) {
            case "Вася":
                System.out.println ("Привет!"+"\nЯ так долго тебя ждал");
                break;
            case "вася":
                System.out.println ("Привет!"+"\nЯ так долго тебя ждал");
                break;
            case "Анастасия":
                System.out.println ("Я так долго тебя ждал");
                break;
            case "анастасия":
                System.out.println ("Я так долго тебя ждал");
                break;
            default:
                System.out.println ("Добрый день, а вы кто?");
        }

    }
}
