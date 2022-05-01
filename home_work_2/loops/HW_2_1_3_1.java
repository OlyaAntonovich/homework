package loops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Возведение в степень. Через консоль пользователь вводит два числа.
// Первое число это число которое мы будем возводить.
// Второе число это степень в которую возводят первое число.
// Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным

public class HW_2_1_3_1 {



       public String printStep (String x, String y) {

           boolean a = mach1(x);
           boolean b = mach(y);
           StringBuilder builder = new StringBuilder();
           StringBuilder v = new StringBuilder();


           double z;

           if (a && b) {

               double num = Double.parseDouble(x);
               int deg = Integer.parseInt(y);
               v = builder.append(num).append('^').append(deg).append('=').append(calDeg(num, deg));
               v = new StringBuilder(builder.toString());
           } else {
               v= new StringBuilder("Введено не число");
           }
           return v.toString();
       }


    /**
     * Проверка строки на содержание целых положительных чисел
     * @param x строка, которая проверяется на наличие целых положительных чисел
     * @return "ответ" (true or false) на наличие целых положительных чисел в строке
     */

    public  boolean mach (String x){
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

    public  boolean mach1 (String x){
        Pattern pattern = Pattern.compile ("^\\-?+[0-9]+((\\.?+\\,?)[0-9]{1,3})$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }

    /**
     * Возведение одного числа в степень, равную другому числу
     * @param x возводимое в степень число
     * @param y степень числа
     * @return результат операции
     */

    public  double calDeg (double x, int y) {
        double deg = 1;
        for (int i=1;i<=y;i++){
            deg = deg*x;
        } return deg;
    }
}
