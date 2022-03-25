package home_work_1;


public class HW_2_2_4 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=8;
        double d = (a + b++)/--c;// результат расчета программы 1
        //должно получиться 1
        //по приоритету: сначала просчитывается b++ (2++=2),
        // полученное значение суммируется a (5+2=7) и делится
        // на c (7)

        System.out.println (d);




    }
}