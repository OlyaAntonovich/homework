package home_work_1;

public class HW_2_2_9 {
    public static void main(String[] args) {
        boolean a= true;
        boolean b= false;
        boolean d = a && b;
        // результат расчета программы false
        // должно получиться false
        // по приоритету: сначала будет вычисляться значение a,
        // т.к. оно равно true, то вычисляется значения b (false)
        // при использовании оператора && true и false дают false

        System.out.println (d);




    }
}
