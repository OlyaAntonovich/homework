package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Найти произведение всех цифр числа
public class HW_2_1_2_1 {
    public static void main(String[] args) {
        String x = args[0];

        boolean a = Mach(x);
        boolean b = Mach1(x);
        String v="";
        long n;
        if (a) {
            n = Long.parseLong(x);

            int i = 1;
            long y = 1;

            for (i=1;n>= 1;i++) {

                y= (n%10*y);

                v=Integer.toString((int)n%10)+"*"+v;

                n=n/10;

            }

            System.out.print (v);
            System.out.print ("="+y);}


        else if (b==true){
            System.out.println ("Введено не целое число");
        } else { System.out.println ("Введено не число");}


    }

    /**
     * Проверка строки на содержание целых положительных чисел
     * @param x строка, которая проверяется на наличие целых положительных чисел
     * @return "ответ" (true or false) на наличие целых положительных чисел в строке
     */

    public static boolean Mach (String x){
        Pattern pattern = Pattern.compile ("^\\d+$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }

    /**
     * Проверка строки на содержание не целых отрицательных чисел
     * @param x строка, которая проверяется на наличие не целых отрицательных чисел
     * @return "ответ" (true or false) на наличие не целых отрицательных чисел
     */


    public static boolean Mach1 (String x){
        Pattern pattern = Pattern.compile ("^\\-?+[0-9]+((\\.?+\\,?)[0-9]{1,3})$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }


}
