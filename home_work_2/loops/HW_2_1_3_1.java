package home_work_2.loops;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Возведение в степень. Через консоль пользователь вводит два числа.
// Первое число это число которое мы будем возводить.
// Второе число это степень в которую возводят первое число.
// Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным

public class HW_2_1_3_1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое число: ");

        String x = in.nextLine();

        System.out.print("Введите любое целое, положительное число: ");

        String y = in.nextLine();

        boolean a = Mach1(x);
        boolean b = Mach(y);
        String v="";
        double num;
        int deg;
        double z;

        if (a==true && b==true){

            num = Double.parseDouble(x);
            deg = Integer.parseInt(y);

            z= CalDeg (num, deg);

            System.out.print (num + "^" + deg + "=" + z);
        }

        else { System.out.println ("Введено не число");}

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

    /**
     * Возведение одного числа в степень, равную другому числу
     * @param x возводимое в степень число
     * @param y степень числа
     * @return результат операции
     */

    public static double CalDeg (double x, int y) {
        double deg = 1;
        for (int i=1;i<=y;i++){
            deg = deg*x;
        } return deg;
    }
}
