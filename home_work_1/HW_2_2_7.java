package home_work_1;

public class HW_2_2_7 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        int c=8;
       // int d = (a+7>20?68>=68:22*b>>b++)/--c;
        // результат расчета программы error
        //bad operand types for binary operator '/'
        // не верно записано условие тернарного оператора
        //из-за чего происходит смешение типов переменных
        //по приоритету: сначала просчитывается выражение
        // в левой части тернарного оператора (ложь)
        // считаем выражение в правой части далее идет побитовая операция
        // сдвиг вправо на 2 бита (или деление на 2 в степени 2 до целого числа), т.е. 44/4 = 11
        // результат делим на c (11/7)

        //System.out.println (d);




    }
}
