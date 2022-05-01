package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе

public class HW_2_1_1_1 {


    public long fac (String x){

        boolean a = Mach (x);
        long n;
        long fac_n=1;

            if (a) {
                n = Long.parseLong (x);

                int i = 1;

                while (i <= n) {

                    fac_n = i*fac_n;

                    if (fac_n>Long.MAX_VALUE||fac_n<0){ //Проверка на переполнение

                        System.out.println ("\nВведено слишком большое число, вы достигли переполнения!\n");
                        break;

                    } else{

                        if (i!=1) {
                            System.out.print ("*"+i);}
                        else {System.out.print (i);}}
                    i++;

                }
                if (fac_n>Long.MAX_VALUE||fac_n<0) {System.out.print (" ");}
                else {System.out.print ("="+fac_n);}


            } else { System.out.println ("Введите верное значение - целое, положительное число!");}
        return fac_n;



    }

    /**
     * Проверка строки на содержание целых положительных чисел
     * @param x строка, которая проверяется на наличие целых положительных чисел
     * @return "ответ" (true or false) на наличие целых положительных чисел в строке
     */

    public  boolean Mach (String x){
        Pattern pattern = Pattern.compile ("^\\d+$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }
}
