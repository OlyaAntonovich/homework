package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//

public class HW_2_1_1_2 {
    long f;
    public static void main(String[] args) {
        String x = args[0]; //Получили значение, введенное через аргумент к исполняемой программе

        boolean a = Mach(x); //Воспользовались методом Mach на поиск соответствия аргумента целому положительному числу

        long n;
        if (a) {
            n = Long.parseLong(x);

            int i = 1;
            long fac_n=1;

            fac_n = Factorial(n);

            while (i<=n){
                if (i!=1) {
                    System.out.print ("*"+i);}
                else {System.out.print (i);}

                i++;
            }

            System.out.print("=" + fac_n);
        } else {
            System.out.println("Введите верное значение - целое, положительное число!");
        }


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
     * Перемножение всех цифр заданного числа (факториал)
     * @param x заданное пользователем число
     * @return факториал заданного числа
     */


    public static long Factorial (long x) {


            if (x==1) {
                return 1;
            }

            return x * Factorial(x - 1);


    }

}