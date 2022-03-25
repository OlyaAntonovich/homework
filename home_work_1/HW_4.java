package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class HW_4 {
    public static void main(String[] args) {

        boolean weekday; //рабочий день
        boolean vacation; //отпуск

        Scanner in = new Scanner(System.in);

        System.out.println ("У тебя сегодня рабочий день?");
        String x = in.nextLine();

        System.out.println ("У тебя сегодня отпуск?");
        String y = in.nextLine();

        String a = "Да";
        String b = "да";

        String v;
        String u;


        if (Objects.equals(x, a)||Objects.equals(x, b)){
            weekday = true;
        }
         else {
            weekday = false;}

        if (Objects.equals(y, a)||Objects.equals(y,b)){
            vacation = true;
        }
        else {
            vacation = false;}


        if (sleepin(weekday, vacation)) {
            System.out.println ("Можешь спать дальше, везунчик");}
            else {System.out.println ("Топай на работу");}
        }
        public static boolean sleepin (boolean weekday, boolean vacation){
            if (!weekday||vacation) return true;
            else return false;
        }
    }

