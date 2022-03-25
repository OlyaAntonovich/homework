package home_work_1;

public class HW_1_1_3 {
    public static void main(String[] args) {
        int a = -42; //11010110
        int b = -15; //11110001

        System.out.println(a&b);   //результат -48 - 11010000
        System.out.println(a|b);   //результат -9 - 11110111
        System.out.println(a^b);   //результат 39 - 00100111
        System.out.println(~a);    //результат 41 - 00101001
        System.out.println(~b);    //результат 14 - 00001110
        System.out.println(b>>2);  //результат -4 - 11111100
        System.out.println(a>>2);  //результат -11 - 11110101
        System.out.println(a>>b);  //результат -1 - 11111111
        System.out.println(b>>a);  //результат -1 - 11111111
        System.out.println(a<<2);  //результат -168 - 11111111 01011000
        System.out.println(b<<2);  //результат -60  - 11000100
        System.out.println(a>>>2);  //результат 1073741813 - 00111111 11111111 11111111 11110101
        System.out.println(b>>>2);  //результат 1073741820 - 00111111 11111111 11111111 11111100
        System.out.println(a>>>b);  //результат 32767 - 01111111 11111111
        System.out.println(b>>>a);  //результат 1023 - 00000011 11111111

        a = -42;//11010110

        System.out.println(a&=b);   //результат -48 - 11010000

        a = -42;//11010110

        System.out.println(a|=b);   //результат -9 - 11110111

        a = -42;//11010110
        System.out.println(a^=b);   //результат 39 - 00100111

        a = -42;//11010110
        System.out.println(a>>=b);  //результат -1 - 11111111

        a = -42;//11010110
        System.out.println(a<<=b);  //результат -5505024 - 11111111 10101100 00000000 00000000
    }
}
