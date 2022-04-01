package home_work_2.sorts;

import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {

    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6};

        Arrays.toString(x);
        System.out.println("Массив до сортировки:" + Arrays.toString(x));

        SortsUtils.buble (x);

        Arrays.toString(x);
        System.out.println("Массив после сортировки:" + Arrays.toString(x));

        int [] y = {1,1,1,1};

        Arrays.toString(y);
        System.out.println("Массив до сортировки:" + Arrays.toString(y));

        SortsUtils.buble (y);

        Arrays.toString(y);
        System.out.println("Массив после сортировки:" + Arrays.toString(y));

        int [] m = {9,1,5,99,9,9};

        Arrays.toString(m);
        System.out.println("Массив до сортировки:" + Arrays.toString(m));

        SortsUtils.buble (m);

        Arrays.toString(m);
        System.out.println("Массив после сортировки:" + Arrays.toString(m));

        int [] z = {};

        Arrays.toString(z);
        System.out.println("Массив до сортировки:" + Arrays.toString(z));

        SortsUtils.buble (z);

        Arrays.toString(z);
        System.out.println("Массив после сортировки:" + Arrays.toString(z));

        int [] e = {6,5,4,3,2,1};

        Arrays.toString(e);
        System.out.println("Массив до сортировки:" + Arrays.toString(e));

        SortsUtils.buble (e);

        Arrays.toString(e);
        System.out.println("Массив после сортировки:" + Arrays.toString(e));


    }






}
