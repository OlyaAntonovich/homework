package home_work_2.arrays;


import java.util.Random;


//Решение задач с массивами чисел. все массивы создаются
// с использованием вызова ранее созданного метода arrayRandom

public class ArraysTasks {
    public static void main(String[] args) {
        int summ = summ();
        System.out.print(summ);

        int max = maxElement();
        System.out.print(max);

        int minSrednee = minSrednee();
        System.out.print(minSrednee);

        int [] minMin = twoMin();

        for (int i=0;i<minMin.length; i++){
            System.out.print(minMin[i]+"  ");
        }

        int [] container = sjatye();
        for (int i=0;i<container.length;i++){
            System.out.print(container[i]+"  ");
        }
        int sum = sumNum();
        System.out.print(sum);


    }


    /**
     * Сумма четных положительных элементов массива
     * @return сумму четных положительных элементов массива
     */

    public static int summ(){
       int x = 1;
       int y = 1;
       int summ = 0;
       int [] container = ArraysUtils.arrayRandom (x, y);

        for(int i=0; i<container.length; i++){
            if (container[i]>0 && container[i]%2==0) {
               summ = container[i]+summ;
            }
        }
        return summ;
  }

    /**
     * Максимальный из элементов массива с четными индексами
     * @return Максимальный из элементов массива с четными индексами
     */

    public static int maxElement(){
        int x = 1;
        int y = 1;

        int [] container = ArraysUtils.arrayRandom (x, y);
        int Max = container[0];

        for(int i=0; i<container.length; i=i+2){

            if(container[i]>Max){
                Max=container[i];
            }
        }
        return Max;

    }

    /**
     * Находятся все элементы массива, которые меньше среднего арифметического
     * @return элементы массива, которые меньше среднего арифметического
     */

    public static int minSrednee(){
        int x = 1;
        int y = 1;

        int [] container = ArraysUtils.arrayRandom(x, y);
        int summ = 0;


        for(int i=0;i<container.length; i++){
            summ = container[i]+summ;
        }

        int minSrednee = summ/container.length;
        System.out.println(minSrednee);


        for(int i=0;i<container.length; i++){
           if(container[i]<minSrednee){
               minSrednee=container[i];}

        }
        return minSrednee;

    }

    /**
     * Находятся два наименьших (минимальных) элемента массива
     * @return два наименьших (минимальных) элемента массива
     */

    public static int[] twoMin(){
        int x = 1;
        int y = 1;

        int [] container = ArraysUtils.arrayRandom(x, y);

        int Min = container [0];
        int n = 0;
        int Min1 =0;

        for(int i=0;i<container.length; i++){
            if(Min>container[i]){
                Min=container[i];
                n=i;
            }
        }

        Min = container[n];
        System.out.println (Min);

        if (Min1!=Min && Min!=container[0]){
            Min1=container [0];
        } else {Min1=container[1];}

        for(int i=0;i<container.length; i++){
            if(container[i]!=Min){
                if (Min1>container[i]){
                    Min1=container[i];
                }
            }
        }
        System.out.println (Min1);

        int [] minMin = {Min, Min1};

        return minMin;
    }

    /**
     * Сжимается массив, удалением элементов, принадлежащих интервалу (определяется рандомно)
     * @return новый массив
     */

    public static int[] sjatye(){
        int x = 1;
        int y = 1;

        int [] container = ArraysUtils.arrayRandom(x, y);

        Random r = new Random();


        int a = r.nextInt();

        int b = r.nextInt(); //Значение другой границы интервала

        int min, max;

        if (a!=b && a<b){
            min = a;
            max= b;
        } else {min = b; max = a;}

        int n = container.length;
        int i = 0;

        while (i<n) {
            if (container[i]>= min && container[i]<=max) {
                n=n-1;

                for(int j=i;j<n; j++){
                    container[j]=container[j+1];
                }

            }
            else {i++;}
        }

        for(i=n+1;i<container.length;i++){
            container[i]=0;
        }


        return container;

    }

    /**
     * Определяется сумма цифр массива
     * @return сумма цифр массива
     */

    public static int sumNum() {
        int x = 1;
        int y = 1;

        int [] container = ArraysUtils.arrayRandom(x, y);

        Random r = new Random();
        int i;
        int num;
        int sum=0;

        for(i=0; i<container.length;i++){

            num=container[i];
            while(num>0){
                sum=sum+num%10;
                num=num/10;
            }
        }
        return sum;




    }



}
