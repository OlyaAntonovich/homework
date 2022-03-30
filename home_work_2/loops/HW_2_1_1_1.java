package home_work_2.loops;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW_2_1_1_1 {
    public static void main(String[] args) {
        String x = args[0];

        boolean a = Mach (x);

        long n;
        if (a) {
            n = Long.parseLong (x);

            int i = 1;
            long fac_n = 1;
            String v;

            while (i <= n) {

                fac_n = i*fac_n;

                if (fac_n>Long.MAX_VALUE||fac_n<0){

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


    }


    public static boolean Mach (String x){
        Pattern pattern = Pattern.compile ("^\\d+$");
        Matcher matcher = pattern.matcher(x);

        boolean y;

        if (matcher.find()) {
            return y = true;
        } else {return y = false;}
    }
}
