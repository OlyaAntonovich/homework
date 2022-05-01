package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Найти произведение всех цифр числа
public class HW_2_1_2_1 {


    public String facOne (String x) {

        boolean a = machElse(x);
        boolean b = machElse1(x);
        StringBuilder builder = new StringBuilder();
        StringBuilder v = new StringBuilder();

        if (a) {
            long  n = Long.parseLong(x);

            long y = 1;

            for (int i = 1; n >= 1; i++) {

                y = (n % 10 * y);


                v.insert(0, ((int) n % 10) + "*");

                n = n / 10;

            }

            builder.append(v).append("=").append(y);

            v = new StringBuilder(builder.toString());

        } else if (b) {
            v = new StringBuilder("Введено не целое число");
        } else {
            v = new StringBuilder("Введено не число");
        }
        return v.toString();
    }

        /**
         * Проверка строки на содержание целых положительных чисел
         * @param x строка, которая проверяется на наличие целых положительных чисел
         * @return "ответ" (true or false) на наличие целых положительных чисел в строке
         */

        public boolean machElse (String x){
            Pattern pattern = Pattern.compile("^\\d+$");
            Matcher matcher = pattern.matcher(x);

            boolean y;

            if (matcher.find()) {
                return y = true;
            } else {
                return y = false;
            }
        }


    /**
     * Проверка строки на содержание не целых отрицательных чисел
     * @param x строка, которая проверяется на наличие не целых отрицательных чисел
     * @return "ответ" (true or false) на наличие не целых отрицательных чисел
     */


    public boolean machElse1 (String x){
        Pattern pattern = Pattern.compile ("^\\-?+[0-9]+((\\.?+\\,?)[0-9]{1,3})$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }


}
