package home_work_1;
import java.util.BitSet;

public class HW_1_1_2 {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111

        System.out.println(a&b);   //результат 10 - 00001010
        System.out.println(a|b);   //результат 47 - 00101111
        System.out.println(a^b);   //результат 37 - 00100101
        System.out.println(~a);    //результат -43 - 11010101
        System.out.println(~b);    //результат -16 - 11110000
        System.out.println(b>>2);  //результат 3 - 00000011
        System.out.println(a>>2);  //результат 10 - 00001010
        System.out.println(a>>b);  //результат 0 - 00000000
        System.out.println(b>>a);  //результат 0 - 00000000
        System.out.println(a<<2);  //результат 168 - 00000000 10101000
        System.out.println(b<<2);  //результат 60  - 00111100
        System.out.println(a>>>2);  //результат 10 - 00001010
        System.out.println(b>>>2);  //результат 3 - 00000011
        System.out.println(a>>>b);  //результат 0 - 00000000
        System.out.println(b>>>a);  //результат 0 - 00000000

        a = 42;//00101010

        System.out.println(a&=b);   //результат 10 - 00001010

        a = 42;//00101010

        System.out.println(a|=b);   //результат 47 - 00101111

        a = 42;//00101010
        System.out.println(a^=b);   //результат 37 - 00100101

        a = 42;//00101010
        System.out.println(a>>=b);  //результат 0 - 00000000

        a = 42;//00101010
        System.out.println(a<<=b);  //результат 1376256 - 00000000 0001010 100000000 00000000
    }
}
